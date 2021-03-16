package InterviewCake.HashTable;

import java.util.HashMap;
import java.util.Map;

public class WordCloudData {
	private Map<String, Integer> wordsToCounts = new HashMap<>();
	public WordCloudData(String str) {
		populateWordsToCounts(str);
	}
	public Map<String, Integer> getWordsToCounts(){
		return wordsToCounts;
	}
	private String capitalize(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1);
	}
	
	private void addWordToMap(String word) {
		if(wordsToCounts.containsKey(word)) {
			wordsToCounts.put(word, wordsToCounts.get(word)+1);
		} else if ( wordsToCounts.containsKey(word.toLowerCase())){
			int newCount = wordsToCounts.get(word.toLowerCase())+1;
			wordsToCounts.put(word.toLowerCase(), newCount);
		} else if (wordsToCounts.containsKey(capitalize(word))) {
			int newCount = wordsToCounts.get(capitalize(word))+1;
			wordsToCounts.put(word, newCount);
			wordsToCounts.remove(capitalize(word));
		} else {
			wordsToCounts.put(word,1);
		}
	}
	private void populateWordsToCounts(String str) {
		int currentWordStartIndex=0;
		int currentWordLength=0;
		for(int i=0;i<str.length();i++){
			char character = str.charAt(i);
			if(i==str.length()-1){
				if(Character.isLetter(character)){
					currentWordLength++;
				}
				if(currentWordLength > 0) {
					String word = str.substring(currentWordStartIndex, currentWordStartIndex+currentWordLength);
					addWordToMap(word);
				}
			} else if (character==' ' || character == '\u2014') {
				if(currentWordLength >0) {
					String word = str.substring(currentWordStartIndex, currentWordStartIndex+currentWordLength);
					addWordToMap(word);
					currentWordLength = 0;
				}
			} else if (character == '.') {
				if (i < str.length() - 1 && str.charAt(i+1) == '.') {
					if(currentWordLength > 0 ) {
						String word = str.substring(currentWordStartIndex, currentWordStartIndex+currentWordLength);
						addWordToMap(word);
					}
				}
			} else if(Character.isLetter(character) || character=='\''){
				if(currentWordLength ==0){
					currentWordStartIndex=i;
				}
				currentWordLength++;
			} else if (character=='_') {
				if(i >0 && Character.isLetter(str.charAt(i-1)) && Character.isLetter(str.charAt(i+1))) {
					if(currentWordLength ==0) {
						currentWordStartIndex = i;
					}
					currentWordLength++;
				} else {
					if(currentWordLength >0) {
						String word = str.substring(currentWordStartIndex, currentWordStartIndex+currentWordLength);
						addWordToMap(word);
						currentWordLength = 0;
					}
				}
			}
		}
	}
}
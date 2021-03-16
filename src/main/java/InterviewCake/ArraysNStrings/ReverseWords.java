package InterviewCake.ArraysNStrings;

public class ReverseWords {
	public static void reverseWords(char[] words){
		reverseChar(words, 0, words.length-1);
		int index = 0, startIndex=0;
		while(index <= words.length){
			if(index==words.length || 	words[index] ==' '){
				reverseChar(words, startIndex, index-1);
				startIndex = index+1;
			}
			index++;
		}
	}
	public static void reverseChar(char[] word, int startIndex, int endIndex){
		System.out.println(new String(word).substring(startIndex,endIndex+1));
		while(startIndex < endIndex){
			char temp = word[startIndex];
			word[startIndex] = word[endIndex];
			word[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	public static void main(String args[]){
		char[] message = { 'c', 'a', 'k', 'e', ' ','p', 'o', 'u', 'n', 'd', ' ','s', 't', 'e', 'a', 'l' };
		reverseWords(message);
		String s = new String(message);
		System.out.println("Reversed Message is "+s);
	}
}
package InterviewCake.HashTable;

import java.util.Set;
import java.util.HashSet;

public class PermutationPalindrome {
	public static boolean hasPalindromePermutation(String str){
		Set<Character> chars = new HashSet<>();
		for(int i=0;i<str.length();i++){
			if(chars.contains(str.charAt(i)))
				chars.remove(str.charAt(i));
			else 
				chars.add(str.charAt(i));
		}
		return chars.size()<=1;
	}
	public static void main(String args[]){
		String str = "civil";
		System.out.println("Is "+str+" palindrome : "+ hasPalindromePermutation(str));
	}
}
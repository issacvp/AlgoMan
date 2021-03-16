package Euler;
/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

*/
import java.util.ArrayList;
import java.util.List;

public class Problem4 {

	boolean checkPalindrome(int number) {
		boolean isPalindrome = true;
		List<Integer> array = convertToList(number);
		if (array != null) {
			int limit = array.size();
			for (int index = 0; index <= (limit - (index + 1)); index++) {
				if (array.get(index) != array.get(limit - (index + 1))) {
					isPalindrome = false;
					break;
				}
			}
			return isPalindrome;
		} else {
			return false;
		}

	}

	List<Integer> convertToList(int number) {
		int remainder = 0;
		List<Integer> array = new ArrayList<Integer>();
		do {
			remainder = number % 10;
			array.add(remainder);
		    number = number - remainder;
			number = number / 10;
		} while (number > 0);
		if (array.size() > 1)
			return array;
		else
			return null;
	}

	public static void main(String[] args) {
		Problem4 palindrome = new Problem4();
		int numberPalindrome = 0;
		int number1 = 999;
		int number2 = 999;
		int multiplied = 0;
		int i=0, j=0;
		for(i=number1;i>0;i--) {
			for(j=number2;j>0;j--) {
				multiplied = i*j;
				if(palindrome.checkPalindrome(multiplied)) {
					if(numberPalindrome<multiplied) {
						numberPalindrome = multiplied;
					}
					break;
				}
			}
		}
		
		System.out.println("Largest Palindrome : "+ numberPalindrome);

		/*
		 * Just to check single number is palindrome if
		 * (palindrome.checkPalindrome(45399454)) {
		 * System.out.println("It is palindrome"); } else {
		 * System.out.println("It is not palindrome"); }
		 */

	}

}

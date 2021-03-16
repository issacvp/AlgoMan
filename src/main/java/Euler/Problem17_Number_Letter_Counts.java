package Euler;

/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 * */

public class Problem17_Number_Letter_Counts {

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	public static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};

	public static String convert(final int n) {
		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? "" : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + "Hundred" + ((n % 100 != 0) ? "And" : "") + convert(n % 100);
		}
		
		return convert(n / 1000) + "Thousand" + ((n % 1000 != 0) ? "And" : "") + convert(n % 1000);
	}

	public static void main(String[] args) {
		/*String nums = new String();
		int num = 1234;
		nums = convert(num);
		System.out.println(num + "=" + nums.length() + ": "+nums);*/
		String nums = "";
		int count = 0;
		int limit = 1000;
		for(int i=1;i<=limit;i++) {
			nums = convert(i);
			System.out.println(i + "=" + nums.length() + ": "+nums);
			count = count+nums.length();
		}
		System.out.println("Total count : "+count);
	}

}

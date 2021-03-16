package Euler;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

// 232792560
1*2*3*2*5*7*2*3*11*13*2*17*19

*/
public class Problem5 {

	static boolean isPrime(int number) {
		boolean isPrime = true;
		for(int i=2; i<number/2;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		int result = 0, rem=0;
		List<Integer> numb = new ArrayList<Integer>();
		for(int i = 1; i<=10 ; i++) {
			if(isPrime(i)) {
				numb.add(i);
			} else {
				int j = i;
				while(j>=1) {
					
				}
			}
		}
 	}

}

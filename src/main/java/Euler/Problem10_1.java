package Euler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.


Solution 

Create a list of consecutive integers from 2 to n: (2, 3, 4, …, n)

Initially, let p be equal 2, the first prime number

Starting from p, count up in increments of p and mark each of these numbers greater than p itself in the list.
These numbers will be 2p, 3p, 4p, etc.; note that some of them may have already been marked

Find the first number greater than p in the list that is not marked.
 If there was no such number, stop. Otherwise, let p now equal this number (which is the next prime), and repeat from step 3


 * 
 * */
public class Problem10_1 {
	public static List<Integer> sieveOfEratosthenes(int n) {
	    boolean prime[] = new boolean[n + 1];
	    Arrays.fill(prime, true);
	    for (int p = 2; p * p <= n; p++) {
	        if (prime[p]) {
	            for (int i = p * 2; i <= n; i += p) {
	                prime[i] = false;
	            }
	        }
	    }
	    List<Integer> primeNumbers = new LinkedList<>();
	    for (int i = 2; i <= n; i++) {
	        if (prime[i]) {
	            primeNumbers.add(i);
	        }
	    }
	    return primeNumbers;
	}

	public static void main(String[] args) {
		Problem10_1 problem = new Problem10_1();
		int limit = 2000000;
		long sum =0l;
		List<Integer> primes = null;
		primes = Problem10_1.sieveOfEratosthenes(limit);
		for(Integer i : primes) {
			sum = sum+i;
		}
		System.out.println("Sum of primes "+sum);
		// TODO Auto-generated method stub

	}

}

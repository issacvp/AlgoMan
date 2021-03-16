package Euler;
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 * */
public class Problem7 {
	boolean checkPrime(int number) {
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
		Problem7 problem = new Problem7();
		int limit = 10001;
		int index = 0;
		int number = 1;
		while(index<=limit) {
			number++;
			if(problem.checkPrime(number)) {
				index++;
			}
		}
		System.out.println(limit+"th prime number is :"+number);
		// TODO Auto-generated method stub

	}

}

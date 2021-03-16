package Euler;
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.


 * 
 * */
public class Problem10 {
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
		Problem10 problem = new Problem10();
		int limit = 2000000;
		int number = 3;
		long sum =2l;
		while(number<limit) {
			if(problem.checkPrime(number)) {
				System.out.println(number);
				sum =sum+number;
			}
			number=number+2;
		}
		System.out.println("Sum of primes "+sum);
		// TODO Auto-generated method stub

	}

}

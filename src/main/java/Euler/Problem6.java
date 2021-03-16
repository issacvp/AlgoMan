package Euler;
/*
 * The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Problem6 {

	public static void main(String[] args) {
		int limit = 100;
		int sumOfSquare = 0;
		int squareOfSum = 0;
		for(int i = 1; i<=limit ;i++) {
			sumOfSquare = sumOfSquare +(i*i);
			squareOfSum = squareOfSum +i;
		}
		squareOfSum = squareOfSum*squareOfSum;
		System.err.println(("Difference : "+(squareOfSum -sumOfSquare)));
	}

}

package Euler;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 * */
public class Problem9 {

	int checkSqrt(int c) {
		int div = 0;
		for (int i = 1; i < c; i++) {
			if (i * i == c) {
				div = i;
			}
		}
		return div;
	}

	public static void main(String[] args) {
		int sq = 0, c = 0, a = 1, b = 1;
		Problem9 prob = new Problem9();
		for (a = 1; a < 1000; a++) {
			for (b = a + 1; b < 1000; b++) {
				sq = a * a + b * b;
				c = prob.checkSqrt(sq);
				if (c > b) {
					//System.out.println("A :" + a + ", B :" + b + ", C" + c);
					if ((a + b + c) == 1000) {
						System.out.println(" Found A :" + a + ", B :" + b + ", C" + c);
						System.out.println(a*b*c);
						break;
					}
				}
			}
		}

	}

}

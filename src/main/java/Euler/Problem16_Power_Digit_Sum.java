package Euler;
import java.math.BigInteger;

/*
 * 
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 */
public class Problem16_Power_Digit_Sum {

	public static void main(String[] args) {
		int limit =1000;
		BigInteger root = new BigInteger("1");
		int sum = 0;
		for(int i=1;i<=limit;i++) {
			root = root.multiply(new BigInteger("2"));
		}
		String num = root.toString();
		for(int j=0;j<num.length();j++) {
			sum = sum+Character.getNumericValue(num.charAt(j));
		}
		System.out.println(sum);
	}

}

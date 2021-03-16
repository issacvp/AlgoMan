package Euler;
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
ans : 6857

71 ,
839 ,
1471 ,
6857 ,
59569 ,
104441 ,
486847 ,
1234169 ,
5753023 ,
10086647 ,
87625999 ,


*/
public class Problem3 {

	public static void main(String[] args) {
		/*long number= 600851475143l;
		for(int dividor = 2; dividor <=number; dividor++) {
			if(number%dividor ==0) {
				System.out.println(dividor + " ,");
			}
		}*/
		int number = 6857;
		boolean isPrime = true;
		for(int i=2; i<number/2;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}

}

package Euler;

public class Problem21_SumOfAmicablePairs {

	public int sumOfProperDivisors(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	
	public static void main(String args[]) {
		Problem21_SumOfAmicablePairs sum = new Problem21_SumOfAmicablePairs();
		int total = 0;
		for(int a=2;a<=100000000;a++) {
			int b=sum.sumOfProperDivisors(a);
			if(a==sum.sumOfProperDivisors(b) && a!=b) {
				total=total+a+b;
				System.out.println("("+a+","+b+")");
			}
		}
		System.out.println(total/2);
	}
}

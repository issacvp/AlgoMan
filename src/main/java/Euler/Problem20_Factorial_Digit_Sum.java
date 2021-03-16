package Euler;

public class Problem20_Factorial_Digit_Sum {

	public static String factorial(int n) {
		return factorial(n,300);
	}
	private static String factorial(int n, int maxSize) {
		int total=0;
		int res[] = new int[maxSize];
		res[0]=1;
		int res_size=1;
		
		for(int x=2;x<=n;x++) {
			res_size= multiply(x,res,res_size);
		}
		
		StringBuffer buff = new StringBuffer();
		for(int i=res_size-1; i>=0; i--) {
			total+=res[i];
			buff.append(res[i]);
		}
		System.out.println(total);
		return buff.toString();
	}
	
	private static int multiply(int x, int res[], int res_size) {
		int carry=0;
		for(int i=0; i<res_size;i++) {
			int prod = res[i]*x+carry;
			res[i] = prod %10;
			carry = prod/10;
		}
		while (carry !=0) {
			res[res_size] = carry %10;
			carry = carry /10;
			res_size++;
		}
		return res_size;
	}
	public static void main(String[] sum) {
		int n=100;
		System.out.printf("Factorial %d = %s",n,factorial(n));
	}
}

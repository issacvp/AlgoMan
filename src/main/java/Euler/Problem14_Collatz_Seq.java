package Euler;
public class Problem14_Collatz_Seq {

	public static void main(String[] args) {
		int limit = 1000000;
		long n =0;
		long longest = 0, chainLegnth=0, length=0;
		for(int index=2;index<limit;index++) {
			n = index;
			do {
				if(n%2==0) {
					n = n/2;
				} else {
					n = 3*n+1;
				}
				length++;
			}while(n!=1);
			System.out.println("Number :"+index +" chain length:" +length);
		   if(chainLegnth<length) {
			   chainLegnth = length;
			   longest = index;
			   
		   }
		   length =0;
		}
		
		System.out.println("Longest chain length :" +chainLegnth+" number is :"+longest);

	}

}

/*
 *
 *another solution 
 long a;
		int j;
		int max = 0;
		int maxnr = 0;
		for(int i = 1; i < 1000000; i++) {
			a = i;
			j = 1;
			while( a != 1 ) {
				a = ((a & 1) == 1) ? (3 * a + 1) : (a >> 1);
				j++;
			}
			if(j > max) {
				max = j;
				maxnr = i;
			}
		}
		System.out.println(maxnr); 
 */
 
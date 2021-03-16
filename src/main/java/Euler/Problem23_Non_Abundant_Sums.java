package Euler;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * 24 => 1+2+3+4+6+12 = 28 
 * 
 * 
 * 
 * */
public class Problem23_Non_Abundant_Sums {
	
	public static void main(String[] args) {
		HashMap<Integer, Boolean> abundantNumbers = new LinkedHashMap<>();
		for(int i=1; i<28124;i++) {
			int sum = 0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum +=j;
				} 
			}
			if(sum > i) {
				abundantNumbers.put(i, true);
			}
		}
		
		long nonAbundantSum = 28123*28124/2;
		for(int i=1;i<28124;i++) {
			for(Integer abundant: abundantNumbers.keySet()) {
				if(i>abundant && abundantNumbers.containsKey(i-abundant)) {
					nonAbundantSum -=i;
					break;
				} 
			}
		}
		System.out.println(nonAbundantSum);
	}
}

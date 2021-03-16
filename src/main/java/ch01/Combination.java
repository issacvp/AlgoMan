package ch01;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	//C(n,r) = C(n-1, r-1) + C(n-1, r)
	private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
	    if (index == data.length) {
	        int[] combination = data.clone();
	        combinations.add(combination);
	    } else if (start <= end) {
	        data[index] = start;
	        helper(combinations, data, start + 1, end, index + 1);
	        helper(combinations, data, start + 1, end, index);
	    }
	}
	
	/*public List<int[]> generate(int n, int r){
		List<int[]> combinations = new ArrayList<>();
	    helper(combinations, new int[r], 0, n-1, 0);
	    return combinations;
	}*/
	
	public List<int[]> generate(int n, int r) {
	    List<int[]> combinations = new ArrayList<>();
	    int[] combination = new int[r];
	 
	    // initialize with lowest lexicographic combination
	    for (int i = 0; i < r; i++) {
	        combination[i] = i;
	    }
	 
	    while (combination[r - 1] < n) {
	        combinations.add(combination.clone());
	 
	         // generate next combination in lexicographic order
	        int t = r - 1;
	        while (t != 0 && combination[t] == n - r + t) {
	            t--;
	        }
	        combination[t]++;
	        for (int i = t + 1; i < r; i++) {
	            combination[i] = combination[i - 1] + 1;
	        }
	    }
	 
	    return combinations;
	}
	
	public List<int[]> generateFromAnArray(int array[], int r){
		List<int[]> combinations = new ArrayList<>();
		int[] combination = null;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				for(int k=j+1;k<array.length;k++) {
					combination = new int[3];
					combination[0] = array[i];
					combination[1] = array[j];
					combination[2] = array[k];
					combinations.add(combination);
				}
			}
		}
		return combinations;
	}
	
	public int findGreatestOfThreeNumbers(int array[]){
		int greatestMul=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				for(int k=j+1;k<array.length;k++) {
					int mul = array[i]*array[j]*array[k];
					if(mul > greatestMul) {
						greatestMul = mul;
					}
				}
			}
		}
		return greatestMul;
	}
	
	
}

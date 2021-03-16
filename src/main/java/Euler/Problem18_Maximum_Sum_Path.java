package Euler;

import java.util.ArrayList;
import java.util.List;

public class Problem18_Maximum_Sum_Path {
	int max = 0;

	void getMax() {
		System.out.println(max);
	}

	void traverse(int array[][], List<Integer> al, int i, int j) {
		if (i == array.length) {
			//System.out.println(al);
			int sum = 0;
			for (int a : al) {
				sum += a;
			}
			if (sum > max)
				max = sum;
			return;
		} else {
			List<Integer> all = new ArrayList<Integer>(al);
			all.add(array[i][j]);
			traverse(array, all, i + 1, j);
			traverse(array, all, i + 1, j + 1);
		}
	}

	public  int maxSum(int[][] graph, int x, int y, int sum) {
		if (x == 14) 
			return sum+graph[x][y];
		
		int max = Math.max(maxSum(graph, x+1, y, sum), maxSum(graph, x+1, y+1, sum));
		sum += graph[x][y];
		return sum+max;
	}
	
	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
	   // int array[][] = { { 3 }, { 7, 4 }, { 2, 4, 6 }, { 8, 5, 9, 3 }, };
	   int array[][] = {
				{75},
				{95,64},
				{17,47,82},
				{18,35,87,10},
				{20,04,82,47,65},
				{19,01,23,75,03,34},
				{88,02,77,73,07,63,67},
				{99,65,04,28,06,16,70,92},
				{41,41,26,56,83,40,80,70,33},
				{41,48,72,33,47,32,37,16,94,29},
				{53,71,44,65,25,43,91,52,97,51,14},
				{70,11,33,28,77,73,17,78,39,68,17,57},
				{91,71,52,38,17,14,91,43,58,50,27,29,48},
				{63,66,04,68,89,53,67,30,73,16,69,87,40,31},
				{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}
		};
	    for(int i = array.length-2; i>=0;i--) {
			for(int j = 0; j <= i ; j++) {
				array[i][j] = Math.max(array[i+1][j]+array[i][j], array[i+1][j+1]+array[i][j]);
			}
		}
		System.out.println(array[0][0]);
		//Problem18_Maximum_Sum_Path main = new Problem18_Maximum_Sum_Path();
		//main.traverse(array, al, 0, 0);
		//main.getMax();
		//System.out.println(main.maxSum(array, 0, 0, 0));
		
		
	}

}

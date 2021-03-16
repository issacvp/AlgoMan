package InterviewCake.GreedyAlgorithms;

import java.lang.Integer;
public class Highest3Product {

	public static int highestProd(int[] values){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i=0; i<values.length;i++) {
			if(values[i] > max1){
				max2 = max1;
				max1 = values[i];
			} 
			if (values[i] < max1 && values[i] > max2){
				max3 = max2;
				max2 = values[i];
			} 
			if (values[i] < max2 && values[i] > max3){
				max3 = values[i];
			} 
			System.out.println("Max1 : "+ max1 + ", Max2 : "+ max2 + ", Max3 : "+ max3);
		}
		return max1*max2*max3;
	}
	public static int highestProductOf3(int[] arrayOfInts) {

		if (arrayOfInts.length < 3) {
			throw new IllegalArgumentException("Less than 3 items!");
		}

		int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
		int lowest  = Math.min(arrayOfInts[0], arrayOfInts[1]);

		int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
		int lowestProductOf2  = arrayOfInts[0] * arrayOfInts[1];

		int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

		for (int i = 2; i < arrayOfInts.length; i++) {
			int current = arrayOfInts[i];

			highestProductOf3 = Math.max(Math.max(
				highestProductOf3,
				current * highestProductOf2),
				current * lowestProductOf2);

			highestProductOf2 = Math.max(Math.max(
				highestProductOf2,
				current * highest),
				current * lowest);

			lowestProductOf2 = Math.min(Math.min(
				lowestProductOf2,
				current * highest),
				current * lowest);

			highest = Math.max(highest, current);

			lowest = Math.min(lowest, current);
		}

		return highestProductOf3;
	}
	
	public static void main(String args[]) {
		int[] values = new int[] {1,10,-5,1,-100};
		System.out.println("Highest product of 3 integers is : " + highestProd(values));
	}
}
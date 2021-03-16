package InterviewCake.ArraysNStrings;

import java.util.Arrays;

public class CounterSort {
	public static int[] sortScores(int[] arr, int highestScore) {
		int[] scores = new int[highestScore+1];
		int index = 0;
		for(int i:arr){
			scores[i]++;
		}
		for(int i=highestScore;i>0;i--){
			for(int j=0; j<scores[i];j++){
				arr[index++]=i;
			}
		}
		return arr;
		
	}
	public static void main(String args[]){
		int[] unsortedScores = {37, 89, 41, 65, 91, 53};
		final int HIGHEST_POSSIBLE_SCORE = 100;
		int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
		System.out.println(Arrays.toString(sortedScores));
	}
}
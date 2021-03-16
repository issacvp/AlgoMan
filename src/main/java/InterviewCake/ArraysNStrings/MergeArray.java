package InterviewCake.ArraysNStrings;

import java.util.Arrays;
public class MergeArray {
	public static int[] merge(int[] arr1, int[] arr2){
		int[] mergeArr = new int[arr1.length+arr2.length];
		int index1=0, index2=0;
		for(int i=0;i<mergeArr.length;i++){	
			if(index1==arr1.length){
				mergeArr[i] = arr2[index2++];
			} else if(index2==arr2.length){
				mergeArr[i] = arr1[index1++];
			} else if(arr1[index1]<arr2[index2]){
				mergeArr[i]=arr1[index1++];
			} else {
				mergeArr[i] = arr2[index2++];
			}
		}
		return mergeArr;
	}
	public static void main(String args[]){
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		System.out.println(Arrays.toString(merge(myArray, alicesArray)));
	}
}
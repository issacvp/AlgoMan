package AlgorithmManual;

public class InsertionSort {
	public static int[] sort(int arr[], int n) {
		int i,j;
		for(i = 0; i< n; i++){
			j=i;
			while((j>0) && arr[j]<arr[j-1]){
				swap(arr, j, j-1);
				j = j-1;
			}
		}
		return arr;
		
	}
	private static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String args[]){
		int arr[] = {1};
		sort(arr, arr.length);
		for(int i : arr){
			System.out.print(i + "\t");
		}
	}
}
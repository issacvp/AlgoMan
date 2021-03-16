package InterviewCake.BinarySearch;

public class RotationPoint {

	public static int  findRotationPoint(int[] array) {
		int left = 0, right = array.length-1;
		while(left <= right) {
			int mid = (left+right)/2;
			System.out.println(left + " : " + mid + " : " + right);
			if(mid== 0 && (array[mid+1] > array[mid] || array[mid+1] < array[mid])) {
				return mid;
			} else if (mid == array.length-1 && (array[mid-1] > array[mid]|| array[mid-1] < array[mid])) {
				return mid;
			} else if ((array[mid-1] > array[mid] && array[mid] < array[mid+1]) || (array[mid-1] < array[mid] && array[mid] > array[mid+1])){
				return mid;
			} else if (array[mid-1] < array[mid] && array[mid] < array[mid+1]) {
				right = mid-1;
			} else if ((array[mid-1] > array[mid] && array[mid] > array[mid+1])){
				left = mid+1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,3,2,1};
		System.out.println("Rotation point is : " + findRotationPoint(array));
		
		int[] array1 = {100,34,6,56,123};
		System.out.println("Rotation point is : " + findRotationPoint(array1));
		
		int[] array2 = {1,2,3,4,5,6,7,8};
		System.out.println("Rotation point is : " + findRotationPoint(array2));
		
		int[] array3 = {9,8,7,6,5,4,3,2,1};
		System.out.println("Rotation point is : " + findRotationPoint(array3));
		
	}
}

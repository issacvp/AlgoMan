package InterviewCake.BinarySearch;

public class Search {

	public static int search(int [] sortedArray, int item) {
		int left = 0, right = sortedArray.length-1, counter=0;
		while(left <= right && counter < 3) {
			int mid = (left+right)/2;
			if(sortedArray[mid]==item) {
				return mid; 
			} else if (sortedArray[mid]<item) {
				left = mid+1;
			} else {
				right = mid-1;
			}
			counter++;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int [] sortedArray = {0,1,2,3,4,5,6};
		System.out.println("What is the pos of 4 : " + search(sortedArray, 4));
		System.out.println("What is the pos of 1 : " + search(sortedArray, 1));
		System.out.println("What is the pos of 3 : " + search(sortedArray, 3));
		System.out.println("What is the pos of 6 : " + search(sortedArray, 6));
		System.out.println("What is the pos of 0 : " + search(sortedArray, 0));
	}
}

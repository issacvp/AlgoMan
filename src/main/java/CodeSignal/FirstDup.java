package CodeSignal;

public class FirstDup {
	//All tests passed except the execution time, need optimization
/*	public int firstDuplicate(int[] a) {
		if (a == null || a.length < 2) {
			return -1;
		} else {
			int firstDup = 0, firstDupInd = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						if (firstDupInd == 0) {
							firstDup = a[i];
							firstDupInd = j;
						}
						if (firstDupInd > 0 && j < firstDupInd) {
							firstDup = a[i];
							firstDupInd = j;
							break;
						}

					}
				}
			}
			if (firstDup > 0) {
				return firstDup;

			} else {
				return -1;
			}
		}

	}*/
	
	//Need to work on the logic of finding duplicate on an array, reduce the complexity to O(n)
	public int firstDuplicate(int[] a) {
		if (a == null || a.length < 2) {
			return -1;
		} else {
			for(int value:a) {
				if(a[Math.abs(value)-1]<0){
					return Math.abs(value);
				}
				a[Math.abs(value)-1]=-a[Math.abs(value)-1];
			}
			return -1;
		}
	}
	
	/**
	 * [2,4,3,3,2,1]
	 * [2,-4,3,3,2,1]
	 * [2,-4,3,-3,2,1]
	 * [2,-4,-3,-3,2,1]
	 * [2,-4,-3,-3,2,1] find the left most duplicate. This algorithm is possible because of the contraints 1<=value <=a.length
 	 *        
	 */ 

}

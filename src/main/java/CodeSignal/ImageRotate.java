package CodeSignal;

public class ImageRotate {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		/*
		 * 1	2
		 * 3	4
		 * 	
		 * top-left  to top-right		[0,0] --> [0,1] 
		 * top-right to bottom-right	[0,1] --> [1,1]
		 * bottom-right to bottom-left	[1,1] --> [1,0]
		 * bottom-left to top-left  	[1,0] --> [0,0]
		 * 
		 * 3	1 
		 * 4	2
		 * 
		 *   temp <-- [0,0]
		 *  [0,0] <-- [1,0]
		 *  [1,0] <-- [1,1]
		 *  [1,1] <-- [0,1]
		 *  [0,1] <-- temp 
		 *  
		 *  temp <-- [0,0] <-- [1,0] <-- [1,1] <-- [0,1] <-- temp
		 *  
		 *  1	2	3
		 *  4	5	6
		 *  7	8	9
		 *  
		 *  1		3			7		1 
		 *              ==>  
		 *  7		9			9		3
		 *  
		 *  	2					4
		 *  4		6	==>		8		2
		 *  	8					6
		 * 
		 * temp = a[x][y] <-- a[length-1-x][y] <-- a[length-1-x][length-1-y] <-- a[x][length-1-y] <-- temp
		 * temp = a[0][0] <-- a[2][0] <-- a[2][2] <-- a[0][2] <-- temp
		 * temp = a[0][1] <-- a[1][0] <-- a[2][1] <-- a[1][2] <-- temp
		 * 
		 * 
		 * 
		 * */
		/*int arr[] = new int [a.length*a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				arr[count++]=a[i][j];
			}
		}
		count=0;
		for(int i=a.length-1;i>=0;i--) {
			for(int j=0;j<a.length;j++) {
				a[j][i]=arr[count++];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}*/
		
		for(int k=0;k<a.length;k++){
	        for(int l=0;l<a.length;l++){
	           System.out.print(a[k][l]);
	        }
	        System.out.println("");
	    }
		System.out.println("");
		for(int i=0;i<a.length;i++){
	        for(int j=0;j<a.length;j++){
	           a[j][a.length-1-i]=a[i][j];
	        }
	        for(int k=0;k<a.length;k++){
		        for(int l=0;l<a.length;l++){
		           System.out.print(a[k][l]);
		        }
		        System.out.println("");
		    }
	        System.out.println("");
	    }
		
		for(int i=0;i<a.length;i++){
	        for(int j=0;j<a.length;j++){
	            //System.out.println("("+j+","+(a.length-1-i)+") <-- ("+i+","+j+")");
	        }   
	    }

	}

}

package Euler;
/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?
 */

public class Problem15_Lattice_Paths {
    public static void main(String args[]) {
    	int limit = 21;
    	long[][] arrays = new long[limit][limit];
    	int i=0,j=0;
    	for( i=0;i<limit;i++) {
    		arrays[i][0] = 1;
    		arrays[0][i] = 1;
    	}
    	for(i=1;i<limit;i++) {
    		for(j=1;j<limit;j++) {
    			arrays[i][j] = arrays[i-1][j]+arrays[i][j-1];
    		}
    	}
    	System.out.println(arrays[limit-1][limit-1]);
    }
}

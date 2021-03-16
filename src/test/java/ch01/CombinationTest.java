package ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ch01.Combination;

class CombinationTest {
	
	public int factorial(int n) {
		if(n==1) {
			return 1;
		} else return n*factorial(n-1);
	}

	//@Test
	public void givenSetAndSelectionSize_whenCalculatedUsingSetRecursiveAlgorithm_thenExpectedCount() {
	    Combination generator = new Combination();
	    int n=5; int r = 3;
	    
	    
	    /*
	     * nCr = n!/((n-r)!*r!)
	     */
	    int nCr = factorial(n)/(factorial(n-r)*factorial(r));
	    List<int[]> selection = generator.generate(n,r);
	    assertEquals(nCr, selection.size());
	}
	
	//@Test
	public void generatorTestwithOne() {
	    Combination generator = new Combination();
	    int n=2; int r = 1;
	    int nCr = factorial(n)/(factorial(n-r)*factorial(r));
	    List<int[]> selection = generator.generate(n,r);
	    assertEquals(nCr, selection.size());
	}
	
	//@Test
	public void generatorFromArray() {
	    Combination generator = new Combination();
	    int array[] = {1,2,3,4,5,6,7};
	    int n=array.length; int r = 3;
	    int nCr = factorial(n)/(factorial(n-r)*factorial(r));
	    List<int[]> selection = generator.generateFromAnArray(array,r);
	    /*for(int[] temp : selection) {
	    	for(int i:temp) {
	    		System.out.print(i+"\t");
	    	}
	    	System.out.println("");
	    }*/
	    assertEquals(nCr, selection.size());
	}
	
	@Test
	public void testGreatestMulOfThreeNumber() {
		int array[] =  {-10,-10,1,3,2};
		int result = 300;
		Combination generator = new Combination();
		assertEquals(result, generator.findGreatestOfThreeNumbers(array) );
	}

}

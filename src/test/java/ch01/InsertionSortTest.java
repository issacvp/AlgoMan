package ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
	InsertionSort sort = new InsertionSort();
	@Test
	public void testSwap() {
		int arr[] = {1,2,3};
		sort.swap(arr, 1,2);
		int newArr[] = {1,3,2};
		assertArrayEquals(arr, newArr);
	}
	@Test
	public void testwapNull() {
		int arr[] = {1};
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			sort.swap(arr, 1, 2);
		});
	}
	
	@Test
	public void testSort() {
		int arr[] = {3,2,1};
		sort.sort(arr, arr.length);
		int expected[] = {1,2,3};
		assertArrayEquals(arr, expected);
	}
	
	@Test
	public void testSortMin() {
		int arr[] = {};
		sort.sort(arr, arr.length);
		int expected[] = {};
		assertArrayEquals(expected, arr);
	}
}
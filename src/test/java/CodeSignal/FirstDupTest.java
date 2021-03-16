package CodeSignal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CodeSignal.FirstDup;

class FirstDupTest {
	FirstDup dup = new FirstDup();
	@Test
	void firstDuplicateTest1() {
		int[] a = {2, 1, 3, 5, 3, 2};
		int result=3;
		assertEquals(result, dup.firstDuplicate(a));
	}
	
	@Test
	void firstDuplicateTest2() {
		int[] a = {2, 2};
		int result =2;
		assertEquals(result, dup.firstDuplicate(a));
	}
	
	@Test
	void firstDuplicateTest3() {
		int[] a = {2, 4, 3, 5, 1};
		int result =-1;
		assertEquals(result, dup.firstDuplicate(a));
	}
	
	@Test
	void firstDuplicateTest4() {
		int[] a = {1};
		int result =-1;
		assertEquals(result, dup.firstDuplicate(a));
	}
	@Test
	void firstDuplicateTest5() {
		int[] a = {5,5,5,5,5,5,5};
		int result =5;
		assertEquals(result, dup.firstDuplicate(a));
	}
	@Test
	void firstDuplicateTest6() {
		int[] a = {2, 1};
		int result =-1;
		assertEquals(result, dup.firstDuplicate(a));
	}
	@Test
	void firstDuplicateTest7() {
		int[] a = {2, 1,3};
		int result =-1;
		assertEquals(result, dup.firstDuplicate(a));
	}
	@Test
	void firstDuplicateTest8() {
		int[] a = {2, 3,3};
		int result =3;
		assertEquals(result, dup.firstDuplicate(a));
	}

}

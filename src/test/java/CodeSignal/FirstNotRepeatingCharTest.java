package CodeSignal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FirstNotRepeatingCharTest {

	FirstNotRepeatingChar repeat = new FirstNotRepeatingChar();
	
	@Test
	void test() {
		String s = null;
		char result='_';
		assertEquals(result, repeat.firstNotRepeatingCharacter(s));
	}
	
	@Test
	void test1() {
		String s = "ababcde";
		char result='c';
		assertEquals(result, repeat.firstNotRepeatingCharacter(s));
	}

}

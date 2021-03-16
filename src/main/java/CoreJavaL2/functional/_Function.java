package CoreJavaL2.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		int incr = increment(1);
		System.out.println(incr);
		int incr2 = incrementByOne.apply(incr);
		System.out.println(incr2);
		System.out.println(incrementMultiply.apply(10, 2));
	}

	static Function<Integer, Integer> incrementByOne = number -> number + 1;
	static BiFunction<Integer, Integer, Integer> incrementMultiply = (num1, num2) -> (num1 + 1) * num2;

	static int increment(int num) {
		return num + 1;
	}

}

package DataStrucAlgo.CH01;

/**
 * R-1.3 Write a short Java method, isMultiple, that takes two long values, n
 * and m, and returns true if and only if n is a multiple of m, that is, n = mi
 * for some integer i.
 *
 * 
 * 
 */
public class R13Even {
	public static boolean isEven(int i) {
		if ((i ^ 1) == (i + 1)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Is 2 even or odd:" + isEven(2));
		System.out.println("Is 3 even or odd:" + isEven(3));
		System.out.println("Is 1000 even or odd:" + isEven(1000));
		System.out.println("Is 1000001 even or odd:" + isEven(100001));
	}
}

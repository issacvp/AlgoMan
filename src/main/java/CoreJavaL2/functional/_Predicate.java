package CoreJavaL2.functional;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("1234567890"));
		System.out.println(isPhoneNumberValid("123456788"));
        System.out.println(isValid.test("1234567890"));
        System.out.println(isValid.test("1231231"));
	}
	static Predicate<String> isValid = phonenum -> phonenum.length()==10;
	static boolean isPhoneNumberValid(String phoneNum) {
		return phoneNum.length()==10?true:false;
	}

}

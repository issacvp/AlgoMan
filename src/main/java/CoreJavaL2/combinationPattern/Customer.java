package CoreJavaL2.combinationPattern;

import java.util.function.Consumer;

public class Customer {

	public static void main(String args[]) {
		hello("John", null, value -> {
			System.out.println("No last name provided for :" + value);
		});
		
	}
	
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if(lastName!=null && lastName.length()>0)
			System.out.println(lastName);
		else 
			callback.accept(firstName);
		
	}
//	function hello(firstName, lastName, callback) {
//		console.log(firstName);
//		if(lastName) {
//			console.log(lastName)
//		} else {
//			callback();
//		}
//	}
}

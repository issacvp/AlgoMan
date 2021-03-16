package DataStrucAlgo.CH01;

import java.util.Scanner;

/*
 * R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different value of
each base type from the standard input device and prints it back to the standard
output device.
*/
public class R11AllBaseTypes {

	public static void inputAllBaseTypes() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value: ");
		String s = scan.nextLine();
		System.out.println("Your input is : "+ s);
	}
	public static void main(String args[]) {
		inputAllBaseTypes();
	}
}
	
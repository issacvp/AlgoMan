package Euler;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

	/*
	 * Pre condition : entered string should not be null This method have a loop
	 * which goes through each character in the input string and checks if it is
	 * 1/0, if any character is not 1/0 then return false If all characters are 1/0
	 * then loop ends and return true;
	 */
	public boolean checkBinary(String number) {
		boolean isBinary = true;
		if (number != null && number.length() > 0) {
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) != '0' && number.charAt(i) != '1') {
					isBinary = false;
					break;
				}
			}
		} else {
			return false;
		}
		return isBinary;
	}

	public int convertBinToDec(int binNum) {
		int decNum = 0, rem = 0, sqRoot = 1;
		while (binNum != 0) {
			rem = binNum % 10;
			decNum = decNum + rem * sqRoot;
			sqRoot = sqRoot * 2;
			binNum = binNum / 10;
		}
		return decNum;
	}

	public int convertDecToBin(int decNum) {
		int binNum = 0, rem = 0, sqRoot = 1;
		while (decNum != 0) {
			rem = decNum % 2;
			binNum = binNum + rem * sqRoot;
			sqRoot = sqRoot * 10;
			decNum = decNum / 2;
		}
		return binNum;
	}
	
	public void operation(char option) {
		int decNum1=0, decNum2=0,decResult=0;
		int binNum1=0,binNum2=0,binResult=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first binary number:");
		String number1 = scan.next();
		System.out.println("Please enter the second binary number:");
		String number2 = scan.next();
		// First check if the entered number is binary
		if (checkBinary(number1) && checkBinary(number1)) {
			binNum1 = Integer.parseInt(number1);
			binNum2 = Integer.parseInt(number2);
			decNum1 = convertBinToDec(binNum1);
			decNum2 = convertBinToDec(binNum1);
			if(option=='C'||option=='c') {
				decResult = decNum1+decNum2;
			} else if(option=='D'||option=='d') {
				decResult = decNum1-decNum2;
			} else if(option=='E'||option=='e') {
				decResult = decNum1*decNum2;
			} else if(option=='F'||option=='f') {
				decResult = decNum1/decNum2;
			} 
		    System.out.println("Result is : "+ convertDecToBin(decResult));
		} else {
			System.out.println("Please enter valid binary numbers");
		}
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		char option = 'a';

		System.out.println("---------------------------------------------");
		System.out.println("---------------Calculator--------------------");
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println("Menu");
		System.out.println("---");
		System.out.println("A : Binary to Decimal");
		System.out.println("B : Decimal to Binary");
		System.out.println("C : Binary Addition");
		System.out.println("D : Binary Substraction");
		System.out.println("E : Binary multiplication");
		System.out.println("F : Binary divition");

		System.out.println("Enter your option:");
		try {
			Scanner scan = new Scanner(System.in);
			int decNum = 0;
			int binNum = 0;
			option = (char) System.in.read();
			if (option == 'A' || option == 'a') {
				System.out.println("You are at binary to decimal");
				System.out.println("Please enter the binary number:");
				String number = scan.next();
				// First check if the entered number is binary
				if (calc.checkBinary(number)) {
					// If true then convert
					binNum = Integer.parseInt(number);
					System.out.println("Decimal value of " + number + " is : " + calc.convertBinToDec(binNum));
				} else {
					System.out.println("Please enter a valid binary number");
				}
			} else if (option == 'B' || option == 'b') {
				System.out.println("You are at decimal to binary");
				System.out.println("Please enter the decimal number:");
				decNum = scan.nextInt();
				System.out.println("Binary value is : " + calc.convertDecToBin(decNum));
			} else if (option == 'C' || option == 'c') {
				System.out.println("You are at binary addition");
				calc.operation(option);
			} else if (option == 'D' || option == 'd') {
				System.out.println("You are at binary substraction");
				calc.operation(option);
			} else if (option == 'E' || option == 'e') {
				System.out.println("You are at binary multiplication");
				calc.operation(option);
			} else if (option == 'F' || option == 'f') {
				System.out.println("You are at binary division");
				calc.operation(option);
			} else {
				System.out.println("Please enter a valid option");
			}
			System.out.println("BYE!!!");
		} catch (IOException e) {
			System.out.println("Something went wrong while inputting");
			e.printStackTrace();
		}
	}

}

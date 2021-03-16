package Euler;

public class Problem19_NumberOfSundays20Centuary {

	public static void main(String args[]) {
		int year = 2018;
		int month = 4;
		int weekday, day;
		for (weekday = 5, day = 26; year < 2021;) {

			weekday++;
			if (weekday > 7)
				weekday = 1;

			day++;
			if (day > 28) {
				if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
					day = 1;
					month++;
				} else if (month == 2) {
					System.out.println("February");
					if(day > 28 ) {
						if(year % 4 ==0 && day > 29) {
							System.out.println("Leap day!!!");
							day = 1;
							month++;
						}else {
							day = 1;
							month++;
						}
					}

				} else if (day > 31) {
					day = 1;
					month++;
				}
				
				
				if (month > 12) {
					month = 1;
					year++;
				}
			}
		}

		switch (month) {
		case 1:
			System.out.print("January");
			break;
		case 2:
			System.out.print("Feburary");
			break;
		case 3:
			System.out.print("March");
			break;
		case 4:
			System.out.print("April");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("June");
			break;
		case 7:
			System.out.print("July");
			break;
		case 8:
			System.out.print("August");
			break;
		case 9:
			System.out.print("September");
			break;
		case 10:
			System.out.print("October");
			break;
		case 11:
			System.out.print("November");
			break;
		case 12:
			System.out.print("December");
			break;
		}

		System.out.print(" : ");
		switch (weekday) {
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;
		case 7:
			System.out.print("Saturday");
			break;
		}

		System.out.print(" : " + day + " : " + year);
		System.out.println("");

	}
}

package CoreJavaL2.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class PrintDate {

	static void printDate(Locale locale) {
		Date currentDate = new Date();
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String date = formatter.format(currentDate);
		System.out.println(date+" "+locale);
	}
	public static void main(String args[]) {
		printDate(Locale.KOREA);
		printDate(Locale.GERMAN);
		printDate(new Locale("in","ID"));
		printDate(Locale.US);
		printDate(Locale.ITALIAN);
	}
}

package CoreJavaL2.streams;

import java.util.Optional;

public class _Optional {

	public static void main(String[] args) {
		Optional.ofNullable(null).ifPresentOrElse(str -> System.out.println("Sending email to : " + str),
				() -> System.out.println("No Email presetn"));

	}

}

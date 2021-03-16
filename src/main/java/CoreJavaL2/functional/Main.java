package CoreJavaL2.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("John", Gender.MALE), new Person("Alex", Gender.MALE),
				new Person("Maria", Gender.FEMALE), new Person("Cut", Gender.MALE), new Person("Faith", Gender.FEMALE),
				new Person("George", Gender.MALE), new Person("Pam", Gender.FEMALE));

		List<Person> females = people.stream()
					.filter(person -> Gender.FEMALE.equals(person.gender))
					.collect(Collectors.toList());
		females.forEach(System.out::println);

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}

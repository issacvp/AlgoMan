package CoreJavaL2.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		greetCustomer(new Customer("Hi", "2342342342"));
        greetCustomerConsumer.accept(new Customer("sdfsd", "342342"));
        greetTwoCustomers.accept(new Customer("Hi", "2342342342"), new Customer("sdfsd", "342342"));
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(customer);
	static BiConsumer<Customer, Customer> greetTwoCustomers= (customer1, customer2) -> System.out.println(customer1 +"" + customer2);
	static void greetCustomer(Customer customer) {
		System.out.println(customer);
	}
	static class Customer{
		
		private final String name;
		private final String phone;
		public Customer(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", phone=" + phone + "]";
		}
		
	}

}

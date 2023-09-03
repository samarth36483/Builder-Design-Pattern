
public class Client {

	public static void main(String[] args) {
		Customer customer = new CustomerBuilder()
				.firstName("Samarth")
				.lastName("Raipuriya")
				.primaryEmail("abc@123")
				.primaryMobileNumber("1234567890")
				.build();
		
		System.out.println(customer.toString());

	}

}

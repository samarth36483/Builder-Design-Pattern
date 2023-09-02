
public class Customer {
	private final String firstName;
	private final String middleName;
	private final String lastName;
	private final String primaryEmail;
	private final String secondaryEmail;
	private final String primaryMobileNumber;
	private final String secondaryMobileNumber;
	
	public Customer(CustomerBuilder customerbuilder) {
		this.firstName = customerbuilder.getFirstName();
		this.middleName = customerbuilder.getMiddleName();
		this.lastName = customerbuilder.getLastName();
		this.primaryEmail = customerbuilder.getPrimaryEmail();
		this.secondaryEmail = customerbuilder.getSecondaryEmail();
		this.primaryMobileNumber = customerbuilder.getPrimaryMobileNumber();
		this.secondaryMobileNumber = customerbuilder.getSecondaryMobileNumber();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public String getPrimaryMobileNumber() {
		return primaryMobileNumber;
	}
	public String getSecondaryMobileNumber() {
		return secondaryMobileNumber;
	}

	@Override
	public String toString() {  // method to display or print our customer
		return "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", primaryEmail=" + primaryEmail + ", secondaryEmail=" + secondaryEmail + ", primaryMobileNumber="
				+ primaryMobileNumber + ", secondaryMobileNumber=" + secondaryMobileNumber + "]";
	}
	
	
}

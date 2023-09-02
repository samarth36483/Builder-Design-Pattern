
public class CustomerBuilder implements Builder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String primaryEmail;
	private String secondaryEmail;
	private String primaryMobileNumber;
	private String secondaryMobileNumber;
	

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
	public CustomerBuilder firstName(final String firstname) {
		this.firstName = firstname;
		return this;
	}

	@Override
	public CustomerBuilder middleName(final String middlename) {
		this.middleName = middlename;
		return this;
		
	}

	@Override
	public CustomerBuilder lastName(final String lastname) {
		this.lastName = lastname;
		return this;
		
	}

	@Override
	public CustomerBuilder primaryEmail(final String primaryemail) {
		this.primaryEmail = primaryemail;
		return this;
		
	}

	@Override
	public CustomerBuilder secondaryEmail(final String secondaryemail) {
		this.secondaryEmail = secondaryemail;
		return this;
		
	}

	@Override
	public CustomerBuilder primaryMobileNumber(final String primarymobilenumber) {
		this.primaryMobileNumber = primarymobilenumber;
		return this;
		
	}

	@Override
	public CustomerBuilder secondaryMobileNumber(final String secondarymobilenumber) {
		this.secondaryMobileNumber = secondarymobilenumber;
		return this;
		
	}
	
	public Customer build() {
		return new Customer(this);
	}
	
	
}

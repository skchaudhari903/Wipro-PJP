public class Employee implements Comparable<Employee> {
	private String firstName; 
	private String lastName;
	private long mobileNumber; 
	private String emailId;	
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, long mobileNumber, String emailId, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.firstName.compareTo(emp.getFirstName()) * -1;
	}
	
}
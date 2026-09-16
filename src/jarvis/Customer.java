package jarvis;

public class Customer {
	
	int customerId;
	String customerName;
	String customerEmail;
	
	public Customer(int customerId, String customerName, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}
	
	void getCustomerData() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + customerName);
		System.out.println("Email: " + customerEmail);
	}

}

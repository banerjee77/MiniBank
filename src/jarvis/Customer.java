package jarvis;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerEmail;
	
	public Customer(int customerId, String customerName, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}
	
	public void getCustomerData() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + customerName);
		System.out.println("Email: " + customerEmail);
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}

}



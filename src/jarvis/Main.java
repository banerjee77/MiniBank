package jarvis;

public class Main {
	
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Rahul", "rahul1997@icici.com");
		c1.getCustomerData();
		
		Account a1 = new Account(5001, 10000, c1);
		
//		Printing the account details
		System.out.println("Account Number: " + a1.getAccountNumber());
		System.out.println("Balance: " + a1.getBalance());
		System.out.println("Customer: " + a1.getCustomer().getCustomerName());
		
//		Calling the deposit method
		a1.deposit(5000);
		
//		Calling the withdraw method
		try {
			a1.withdraw(20000);
		} catch (IllegalArgumentException e) {
			System.out.println("Balance is less than the withdrawal amount.");
		}
		
	}

}


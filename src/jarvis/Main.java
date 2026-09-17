package jarvis;

public class Main {
	
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Rahul", "rahul1997@icici.com");
		c1.getCustomerData();
		
		Account a1 = new SavingsAccount(5001, 10000, c1);
		Account a2 = new CurrentAccount(5002, 20000, c1, 10000);
		
//		Printing the account details
		System.out.println("Account Number: " + a1.getAccountNumber());
		System.out.println("Balance: " + a1.getBalance());
		
//		Calling the calculateInterest method
		double interest1 = a1.calculateInterest(5);
		System.out.println("Interest at 5%: " + interest1);
		
//		Calling the calculateInterest method from CurrentAccount class
		double interest2 = a2.calculateInterest(5);
		System.out.println("Interest at 5%: " + interest2);
		
		System.out.println("Customer: " + a1.getCustomer().getCustomerName());
		
//		Calling the deposit method
		a1.deposit(5000);
		
//		Calling the withdraw method
		try {
			a1.withdraw(25000);
		} catch (IllegalArgumentException e) {
			System.out.println("Balance is less than the withdrawal amount.");
		}
		
//		Calling CurrentAccount class withdraw() method
		a2.withdraw(2000);
		System.out.println("Current Balance after withdrawal: " + a2.getBalance());
		
	}

}


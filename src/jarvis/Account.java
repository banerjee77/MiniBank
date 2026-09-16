package jarvis;

public class Account {
	
	private int accountNumber;
	private double balance;
	private Customer customer;
	
	public Account(int accountNumber, double balance, Customer customer) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Current Balance: " + balance);
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			throw new IllegalArgumentException ("Balance is less than the withdrawal amount...");
		}
	}

}

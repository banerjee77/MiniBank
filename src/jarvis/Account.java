package jarvis;

public class Account {
	
	int accountNumber;
	double balance;
	Customer customer;
	
	public Account(int accountNumber, double balance, Customer customer) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}

}

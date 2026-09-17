package jarvis;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int accountId, double balance, Customer customer) {
		super(accountId, balance, customer);
	}
	
//	Creating the interest calculator method
	public double calculateInterest(double rate) {
		double interest = (getBalance() * rate) / 100;
		
		return interest;
	}

}




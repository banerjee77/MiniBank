package jarvis;

public class CurrentAccount extends Account {
	
	public CurrentAccount(int accountId, double balance, Customer customer) {
		super(accountId, balance, customer);
	}
	
	@Override
	public double calculateInterest(double rate) {
		return 0;
	}

}

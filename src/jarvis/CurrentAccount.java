package jarvis;

public class CurrentAccount extends Account {
	
	private double overDraftAmount;
	
	public CurrentAccount(int accountId, double balance, Customer customer, double overDraftAmount) {
		super(accountId, balance, customer);
		
		this.overDraftAmount = overDraftAmount;
	}
	
	@Override
	public double calculateInterest(double rate) {
		return 0;
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < -overDraftAmount) {
			throw new IllegalArgumentException("The amount exceeds the overdraft limit.");
		}
		
		setBalance(getBalance() - amount);
	}

}

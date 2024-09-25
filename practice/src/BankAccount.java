
public class BankAccount {

	private String accountNumber;
	private double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		
		if(newBalance >= 0) {
		this.balance = newBalance;
		}
		else {
			System.out.println("invalid operation: balance can't be negative");
		}
	}
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
}

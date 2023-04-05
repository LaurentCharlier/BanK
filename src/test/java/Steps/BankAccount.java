package Steps;

public class BankAccount {
	private double balance;
	
	BankAccount(){
		this.balance = 0;
	}
	
	public BankAccount(int n) {
		this.balance=n;
	}
	
	public void deposit(double amount) {
		if(amount<0) {
			throw new IllegalArgumentException();
		}else {
			balance += amount;
			return ;
		}
	}
	
	//je m'appelle toto
	
	public void withdraw(double amount) {
		if(amount>balance) {
			throw new IllegalArgumentException();
		}else {
			balance -= amount;
			return ;
		}
	}
	
	public double checkBalance() {
		return balance;
	}
}


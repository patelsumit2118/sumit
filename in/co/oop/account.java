package in.co.oop;

public class account {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	private String accounttype;

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		this.balance = amount;
	}
	public double deposite(double amount) {
		if (amount <= 0) {
			System.out.println("please deposite greater amount than 0");
			System.out.println("thank you");
			return balance;
		}else {
			balance += amount;
			return balance;
		} 
	
				
 }
	}
	
	
	
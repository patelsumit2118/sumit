package in.co.oop;

public class account3 {
	private String name;
	private String number;
	private String accounttype;
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double diposite(double amount) {
		if (amount <= 0) {
			System.out.println("please diposite + value");
		} else {
			if (amount == 0) {
				System.out.println("please enter greater than 0");
			} else {
				balance = amount;
			}

		}
		return balance;
	}

	public double withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			System.out.println("Yes");
			return balance;
		} else if (amount == balance) {
			System.out.println("no");
			return balance;
		} else {
			System.out.println("hp");
		}

		return amount;

	}
}

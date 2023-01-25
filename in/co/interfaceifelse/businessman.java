package in.co.interfaceifelse;

public class businessman implements richman, socialworker {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void helptoothers() {

		int i = getBalance();
	
	int j =	i - balance;
	}

	@Override
	public void donation() {

	}

	@Override
	public void party() {

	}

	@Override
	public void earnmoney() {

	}
}
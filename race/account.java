package in.co.race;

public class account {
	private int balance = 0;
	
	public synchronized void deposit(String msg,int amnt) {
		int bal = getBalance();
		bal = bal + amnt;
		setBalance(bal);
		System.out.println(msg+"new balance"+ bal);
	}

	public int getBalance() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}

}

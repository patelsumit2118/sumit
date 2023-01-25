package in.co.oop;

public class account1 {
	private double balance;

	public double getBalance() {
		return balance;
	}
	public double diposite(double amount) {
		if(amount < 0) {
			System.out.println("please diposite + value");
		}else 
			if (amount == 0) {
				System.out.println("please enter than 0");
			}else {
				balance+= amount;
			}
		return balance;
		
			
		
		}
	}



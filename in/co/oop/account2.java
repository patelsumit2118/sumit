package in.co.oop;

public class account2 {
	private String name;
	private int number;
	private String accounttype;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public double  diposite(double amount) {
		if (amount < 0 ) {
			System.out.println("please diposite+ value");
		} else {
			if (amount == 0) {
				System.out.println("please enter than 0");
			}else {
				balance += amount;
				
			}
		}
		return amount;
		
	}
			
		double withdraw (double amount1){
				if (amount1 < balance ) {
					balance -= amount1;
					System.out.println("hurrey withdrawal successful");
					return balance;
				}else if (amount1 == balance) {
					System.out.println("at leat 1rs remain in your account");
					return balance;
				}else {
					System.out.println("insufficint balance");
					return balance;
					
				}
					
				
		}
		public double paybill(double amount) {
			if(amount< balance) {
				balance -= amount;
				System.out.println("hurrey fund transfer successful");
				return balance;
			} else if (amount == balance) {
				System.out.println("at least 1rs remain in your account");
				return balance;
			} else {
				System.out.println("insufficent balance");
				return balance;
				
			}
		}
		
						
					
	}
	



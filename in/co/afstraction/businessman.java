package in.co.afstraction;

public class businessman implements richman,socialworker{
private  int money=200;
	@Override
	public void helptoothers() {
		System.out.println("help to others");
	}

	@Override
	public void earnmoney() {
		
		money=money+100;
		System.out.println("earnmoney"+" "+money);
	}

	@Override
	public void donatiom() {
		System.out.println("help to others");
		
	}

	@Override
	public void party() {
		System.out.println("doing party");
	}
	

}

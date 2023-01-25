package in.co.afstractionpractice;

public class businessman implements richman,socialworker{

	@Override
	public void helptoothers() {
		System.out.println("daru pine wale ko chakhna deta hai");
		
	}

	@Override
	public void earnmoney() {
		
		System.out.println(1000);
		
	}

	@Override
	public void donation() {
		System.out.println(200);
		
	}

	@Override
	public void party() {
		System.out.println(60);
	}

	@Override
	public void name() {
		System.out.println("sumit patel");
	}

	@Override
	public void address() {
		System.out.println("indore");
	}

	
	
}


package in.co.race;

public class raceconditionthread extends Thread{
	public static account data = new account();
	
	String name =  null;
	
	public raceconditionthread(String name) {
		this.name = name;
		
	}
	public void run() {
		for(int i = 0 ; i <5; i++) {
			data.deposit(name, 1000);
		}
	}
	
	
	

}

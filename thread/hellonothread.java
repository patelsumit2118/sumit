package in.co.thread;

public class hellonothread extends Thread {
	
	
	String name = null;
	
	
	public hellonothread(String n) {
		name = n;
		
		
	}
	
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println(i+name);
		}
	}
	

}

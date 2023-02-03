package in.co.thread;

public class testclass  {
	

	public static void main(String[] args) {
		
		hellonothread t1 = new hellonothread("sumit");
		hellonothread t2 = new hellonothread("amit");
		
		t1.run();
		t2.run();
		
		for(int i = 0; i<50; i++) {
			System.out.println("main");
		}

	}
	
	
}

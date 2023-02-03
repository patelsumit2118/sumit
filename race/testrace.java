package in.co.race;

public class testrace {
	public static void main(String[] args) {
		
		raceconditionthread t1 = new raceconditionthread("sumit");
		raceconditionthread t2 = new raceconditionthread("aman");
		
		t1.start();
		t2.start();
	}

}

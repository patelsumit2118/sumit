package in.co.oop;

public class testrectangle {
	public static void main(String[] args) {
		
		rectangle r = new rectangle();
		r.setLength(20);
		r.setWidth(10);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println("TotalArea ="+ r.getLength()*r.getWidth());
	
	}
}

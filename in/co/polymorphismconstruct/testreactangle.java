package in.co.polymorphismconstruct;

public class testreactangle {
	public static void main(String[] args) {
		
		reactangle r = new reactangle("black", 25,10, 10);
		r.getColor();
		r.getLength();
		r.getWidth();
		r.getBorderwidth();
		System.out.println(r.area());
		System.out.println(r.borderwidth );
		System.out.println(r.color);
		System.out.println(r.length);
		System.out.println(r.width);
		
		
		circle c = new circle(25, "red", 25);
		System.out.println(c.area1());
		
		
		triangle t = new triangle("pink", 25, 10, 20);
		System.out.println(t.area2());
		
		
	}
	

}

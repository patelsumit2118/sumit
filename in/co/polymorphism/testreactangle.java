package in.co.polymorphism;

public class testreactangle {
	public static void main(String[] args) {
		
		reactangle r = new reactangle();
		r.setLength(10);
		r.setWidth(20);
		System.out.println(r.area());
		
		circle c = new circle();
		c.setRadius(10);
		System.out.println(c.area1());
		
		triangle t = new triangle();
		t.setBase(21);
		t.setHeight(20);
		System.out.println(t.area2());
	}
	

}

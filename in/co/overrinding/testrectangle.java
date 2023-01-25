package in.co.overrinding;

public class testrectangle {
	public static void main(String[] args) {
		
		reactangle r = new reactangle();
		r.setColor("blue");
		r.setBorderwidth(25);
		r.setLength(20);
		r.setWidth(20);
		System.out.println(r.area());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
		
		
		circle c = new circle();
		c.setRadius(30);
		System.out.println(c.area2());
		
		
		triangle t = new triangle();
		t.setBase(25);
		t.setHight(20);
		System.out.println(t.area3());
		
		
		
		
		
		
		
	}
	
}

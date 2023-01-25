package in.co.inheritance;

public class testshape   {
	public static void main(String[] args) {
		
		reactangle r = new reactangle();
		r.setColor("red");
		r.setBorderwidth(78);
		r.setLength(25);
		r.setWidth(25);
		
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getLength()*r.getWidth());
	}
		
}

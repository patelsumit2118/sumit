package in.co.inheritance;

public class shape2test {
	public static void main(String[] args) {
		reactangle1 r = new reactangle1();
		r.setColor("pink");
		r.setBorderwidth(40);
		r.setLength(20);
		r.setWidth(23);
		System.out.println(r.getColor());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getLength()* r.getWidth());
	}

}

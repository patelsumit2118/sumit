package in.co.inheritance;

public class testshape1 {
	public static void main(String[] args) {
		
		circle c = new circle();
		c.setColor("black");
		c.setBorderwidth(30);
		c.setRadius(10
				);
		
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println(c.getRadius()* 3.14*c.getRadius());
	}

}
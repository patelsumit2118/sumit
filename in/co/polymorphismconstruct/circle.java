package in.co.polymorphismconstruct;

public class circle extends shape {
	

	int radius;

	public int getRadius() {
		return radius;
	}

	public circle(int radius,String color, int borderwidth) {
		super( color,  borderwidth);
		this.radius = radius;
	}
	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	

}

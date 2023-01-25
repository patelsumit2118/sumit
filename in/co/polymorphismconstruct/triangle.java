package in.co.polymorphismconstruct;

public class triangle  extends shape{
	int base;
	int height;
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public triangle(String color, int borderwidth, int base, int height) {
		super(color, borderwidth);
		this.base = base;
		this.height = height;
	}
	@Override
	public double area2() {
		// TODO Auto-generated method stub
		return base*height;
	}
	
	

}

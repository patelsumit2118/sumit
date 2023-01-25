package in.co.polymorphismconstruct;

public class reactangle  extends shape{
	
	public reactangle(String color, int borderwidth, int length, int width) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
	}
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	

}

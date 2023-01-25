package in.co.overridingconstructor;

public class rectangle extends shape{
	
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public rectangle(int length, int width,String color, int borderwidth) {
		super(color,width);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		
		return length*width;
	}
	

}

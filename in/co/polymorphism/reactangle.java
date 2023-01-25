package in.co.polymorphism;

public class reactangle extends shape {
	
	
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
		
		
	}
	

}

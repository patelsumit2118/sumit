package in.co.polymorphism;

public class triangle extends shape{
	
	int base;
	int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area2() {
		// TODO Auto-generated method stub
		return base*height;
	}

}

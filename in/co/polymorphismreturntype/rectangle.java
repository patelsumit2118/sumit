package in.co.polymorphismreturntype;

public class rectangle extends shape{
	int length;
	int width;
	public rectangle(int length, int width) {
		super(length);
		this.length = length;
		this.width = width;
	}
	public double area () {
		double rarea = length * width;
		System.out.println("rectangle area = "+rarea);
		return rarea;
	}

}

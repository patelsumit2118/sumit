package in.co.polymorphismusingarray;

public class rectangle extends shape {
	int length;
	int width;
	public rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double area() {
		double rarea = length * width; 
		System.out.println("rectangle_area="+rarea);
		return rarea;
	}

}

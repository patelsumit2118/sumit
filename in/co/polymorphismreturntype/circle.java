package in.co.polymorphismreturntype;

public class circle extends shape {
	int radius;

	public circle(int radius) {
		super(radius);
		this.radius = radius;
	}
	public double area() {
		double carea = 3.14*radius*radius;
		System.out.println("circle area ="+ carea);
		return carea;
	}

}

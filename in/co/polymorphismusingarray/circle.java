package in.co.polymorphismusingarray;

public class circle  extends shape{
	int radius;

	public circle(int radius) {
		super();
		this.radius = radius;
	}
	public double area() {
		double carea = ( 3.14*radius*radius);
		System.out.println("circle_area =" + carea);
		return carea;
	}

}

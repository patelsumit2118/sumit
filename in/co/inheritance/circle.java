package in.co.inheritance;

public class circle extends shape {
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14* radius* radius; 
	}

}

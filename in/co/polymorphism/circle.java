package in.co.polymorphism;

public class circle extends shape {
	

	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}

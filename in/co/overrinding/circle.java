package in.co.overrinding;

public class circle  extends shape{
	

	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double area2() {
		
		return 3.14*radius*radius;
	}

}

package in.co.inheritance;

public class circleconstructor  extends shapeconstructor{
	int radius;

	public int getRadius() {
		return radius;
	}

	public circleconstructor(int radius,String color, int borderwidth) {
		super(color,borderwidth);
		this.radius = radius;
	}


	

}

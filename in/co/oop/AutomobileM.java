package in.co.oop;

public class AutomobileM {
	private String color;
	private int gear;
	private String make;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	

	public int getGear(int speed) {
		switch (speed) {
		case 1:
			System.out.println("1st Gear - Speed is 0 - 20");
			break;
		case 2:
			System.out.println("2nd Gear - speed is 20 - 40");
			break;
		default:
			System.out.println("Out of the range only 1 to 5 gears available");
			break;
		}

		return speed;
	}

}

package in.co.oop;

public class automobile1 {
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
			System.out.println("1st gear - speed  is 0 - 20");
			break;
		case 2 :
			System.out.println("2nd gear - speed is 20 - 40");
            break;
		
            
            
		default:
		
			System.out.println("out of range only 1 to 4 gears avialable");
			break;
		};
		return speed;
	}
	
	
	
	
	
	}


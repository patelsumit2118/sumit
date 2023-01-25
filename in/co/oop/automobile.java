package in.co.oop;

public class automobile {
	private String color;
	private int speed;
	private String make;
	private String break1;
	private String changegear;
	private String aaccelerator;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		if(speed==60) {
			System.out.println("1st Gear");
		}else if(speed==40) {
			System.out.println("2nd Gear");
		}
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getBreak1() {
		return break1;
	}
	public void setBreak1(String break1) {
		this.break1 = break1;
	}
	public String getChangegear() {
		return changegear;
	}
	public void setChangegear(String changegear) {
		this.changegear = changegear;
	}
	public String getAaccelerator() {
		return aaccelerator;
	}
	public void setAaccelerator(String aaccelerator) {
		this.aaccelerator = aaccelerator;
	}
	
	

}

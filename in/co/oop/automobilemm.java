package in.co.oop;

public class automobilemm {
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
			System.out.println("first gear - speed 0- 20");
		   break;
		case 2 :
			System.out.println("second gear - speed 20 - 40");
			break;
		default:
		case 3:
			System.out.println("out of range only 1 to 2 gear avaivalablr");
			break;
		}
		return speed;
	}
			
		
		  

		
			
		
		
	}
	



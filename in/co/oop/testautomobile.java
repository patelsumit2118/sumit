package in.co.oop;

public class testautomobile {
	public static void main(String[] args) {
		
		automobile a = new automobile();
		
		a.setBreak1("break1");
		a.setColor("red");
		a.setMake("car");
		a.setAaccelerator("aaccelerator");
		a.setSpeed(150);
		a.setChangegear("changegear");
		System.out.println(a.getBreak1());
		System.out.println(a.getColor());
		System.out.println(a.getMake());
		System.out.println(a.getAaccelerator());
		System.out.println(a.getSpeed());
		System.out.println(a.getChangegear());
				
	}

}

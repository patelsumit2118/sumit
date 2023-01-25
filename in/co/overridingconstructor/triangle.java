package in.co.overridingconstructor;

public class triangle extends shape {
	
	int base;
	public triangle(int base, int hight,String color, int borderwidth) {
		super(color,borderwidth);
		this.base = base;
		this.hight = hight;
	}
	
	int hight;
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	@Override
	public double area2() {
		
		return base*hight;
	}
	

}

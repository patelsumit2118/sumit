package in.co.inheritance;

public class triangleconstructor extends shapeconstructor {
	int base;
	int height;
	public triangleconstructor(int base, int height,String color, int borderwidth) {
		super(color,borderwidth);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	

}

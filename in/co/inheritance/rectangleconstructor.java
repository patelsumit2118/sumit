package in.co.inheritance;

public class rectangleconstructor  extends shapeconstructor{
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	int length ;
	int width;
	public rectangleconstructor(int length, int width, String color, int borderwidth) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
	}

}

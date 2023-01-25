package in.co.overrinding;

public class triangle extends shape {
	
	int base;
	int hight;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	@Override
	public double area3() {
		// TODO Auto-generated method stub
		return base*hight;
	}
	

}

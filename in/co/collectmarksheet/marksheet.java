package in.co.collectmarksheet;

public class marksheet {
	private String roolNo;
	private String name;
	private int phyics;
	private int chemistry;
	private int maths;
	public marksheet(String roolNo, String name, int phyics, int chemistry, int maths) {
		super();
		this.roolNo = roolNo;
		this.name = name;
		this.phyics = phyics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
	public String getRoolNo() {
		return roolNo;
	}
	public String getName() {
		return name;
	}
	public int getPhyics() {
		return phyics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public int getMaths() {
		return maths;
	}
	

}

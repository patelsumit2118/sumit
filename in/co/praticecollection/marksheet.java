package in.co.praticecollection;

public class marksheet {
	private String name;
	private String roolNo;
	private int maths;
	private int account;
	private int business;
	public marksheet(String name, String roolNo, int maths, int account, int business) {
		super();
		this.name = name;
		this.roolNo = roolNo;
		this.maths = maths;
		this.account = account;
		this.business = business;
	}
	public String getName() {
		return name;
	}
	public String getRoolNo() {
		return roolNo;
	}
	public int getMaths() {
		return maths;
	}
	public int getAccount() {
		return account;
	}
	public int getBusiness() {
		return business;
	}
	

}

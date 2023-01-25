package in.co.collectmarksheet;

public class marksheet1 {
	private String name;
	private String rooNo;
	private int business;
	private int english;
	private int account;
	public marksheet1(String name, String rooNo, int business, int english, int account) {
		super();
		this.name = name;
		this.rooNo = rooNo;
		this.business = business;
		this.english = english;
		this.account = account;
	}
	public String getSumit() {
		return name;
	}
	public String getRooNo() {
		return rooNo;
	}
	public int getBusiness() {
		return business;
	}
	public int getEnglish() {
		return english;
	}
	public int getAccount() {
		return account;
	}
	

}

package in.co.praticecollection;

public class marksheet1 {
	private String name;
	private String roolNo;
	private int hindi;
	private int english;
	private int sanskrit;
	public marksheet1(String name, String roolNo, int hindi, int english, int sanskrit) {
		super();
		this.name = name;
		this.roolNo = roolNo;
		this.hindi = hindi;
		this.english = english;
		this.sanskrit = sanskrit;
	}
	public String getName() {
		return name;
	}
	public String getRoolNo() {
		return roolNo;
	}
	public int getHindi() {
		return hindi;
	}
	public int getEnglish() {
		return english;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	

}

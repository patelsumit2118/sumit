package in.co.collectmarksheet;

public class marksheet2 {
	
	private String name;
	private String rollNo;
	private int hindi;
	private int english;
	private int sanskrit;
	public marksheet2(String name, String rollNo, int hindi, int english, int sanskrit) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.hindi = hindi;
		this.english = english;
		this.sanskrit = sanskrit;
	}
	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollNo;
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

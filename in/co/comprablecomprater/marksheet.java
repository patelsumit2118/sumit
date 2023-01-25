package in.co.comprablecomprater;

public class marksheet implements Comparable<marksheet>{
	String rollNo;
	String firstname;
	String lastname;
	int marks;
	public marksheet(String rollNo, String firstname, String lastname, int marks) {
		super();
		this.rollNo = rollNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(marksheet m) {
		
		return rollNo.compareTo(m.rollNo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+ ", "+ firstname + ","+ lastname+","+marks +",";
	}
	

}

package in.co.comprablecomprater4;

public class marksheet implements Comparable<marksheet>{

	String rollNo;
	String firstName;
	String lastName;
	int marks;
	public marksheet(String rollNo, String firstName, String lastName, int marks) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(marksheet m) {
		// TODO Auto-generated method stub
		return m.rollNo.compareTo(m.rollNo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo+","+ firstName+","+ lastName+","+ marks+",";
	}
	
	

}

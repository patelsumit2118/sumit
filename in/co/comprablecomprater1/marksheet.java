package in.co.comprablecomprater1;

public class marksheet implements Comparable<marksheet> {
	String firstName;
	String lastName;
	String rollNo;
	int marks;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public marksheet(String firstName, String lastName, String rollNo, int marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.marks = marks;
		
		
	}
	@Override
	public int compareTo(marksheet m) {
		
		return rollNo.compareTo(m.rollNo);
		
	}
	@Override
	public String toString() {
		
		return rollNo+" ,"+ firstName+" ," + lastName+" ,"+ marks+" ,";
				
	}
	
	

}

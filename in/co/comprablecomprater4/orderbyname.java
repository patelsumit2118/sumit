package in.co.comprablecomprater4;

import java.util.Comparator;

public class orderbyname implements Comparator<marksheet> {

	@Override
	public int compare(marksheet m1, marksheet m2) {
		// TODO Auto-generated method stub
		return m1.firstName.compareTo(m2.firstName);
	}
	

}

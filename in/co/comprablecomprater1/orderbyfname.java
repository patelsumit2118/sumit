package in.co.comprablecomprater1;

import java.util.Comparator;

public class orderbyfname implements Comparator<marksheet>{

	@Override
	public int compare(marksheet m1, marksheet m2) {
		
		return m1.firstName.compareTo(m2.firstName);
	}
	

}

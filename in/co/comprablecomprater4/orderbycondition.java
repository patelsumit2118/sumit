package in.co.comprablecomprater4;

import java.util.Comparator;

public class orderbycondition implements Comparator<marksheet>{

	@Override
	public int compare(marksheet m1, marksheet m2) {
		// TODO Auto-generated method stub
		 if(m1.firstName.equals(m2.firstName)) {
			 return m1.lastName.compareTo(m2.lastName);
		}else {
			return m1.firstName.compareTo(m2.firstName);
			
		}
		
	}

}

package in.co.comprablecomprater;

import java.util.Comparator;

public class orderbycondition implements Comparator<marksheet>{

	@Override
	public int compare(marksheet m1, marksheet m2) {
		// TODO Auto-generated method stub
		
		if(m1.firstname.equals(m2.firstname)){
			return m1.lastname.compareTo(m2.lastname);
			
		}else {
		return m1.firstname.compareTo(m2.firstname);
	}
	

	}
}

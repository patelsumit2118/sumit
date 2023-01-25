package in.co.comprablecomprater4;

import java.util.ArrayList;
import java.util.Collections;

public class testmarksheet {
	public static void main(String[] args) {
		
		ArrayList marksheets = new ArrayList();
		
		marksheets.add(new marksheet("s1", "sita", "ashoka", 98));
		marksheets.add(new marksheet("s2", "ram", "ashoka", 45));
		marksheets.add(new marksheet("s3", "radha", "ashoka", 56));
		marksheets.add(new marksheet("s4", "krishna", "ashoka", 67));
		
		Collections.sort(marksheets,new orderbycondition());
		for(Object o: marksheets) {
			System.out.println(o);
		}
	}

}

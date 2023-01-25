package in.co.comprablecomprater3;

import java.util.ArrayList;
import java.util.Collections;

public class testmarksheet {
	public static void main(String[] args) {
		
		ArrayList marksheets = new ArrayList();
		
		marksheets.add(new marksheet("ns1", "sumit", "verma", 67));
		marksheets.add(new marksheet("ns2", "sumit", "sonaniya", 56));
		marksheets.add(new marksheet("ns3", "sumit", "patel", 95));
		marksheets.add(new marksheet("ns4", "sumit", "chandrwanshi", 87));
		
		Collections.sort(marksheets,new orderbycondition());
		for(Object o : marksheets) {
			System.out.println(o);
		}
	}

}

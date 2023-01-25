package in.co.comprablecomprater2;

import java.util.ArrayList;
import java.util.Collections;



public class testmarksheet {
	public static void main(String[] args) {
		
		ArrayList marksheets = new ArrayList();
		marksheets.add(new marksheet("a1", "zman", "zerma", 57));
		marksheets.add(new marksheet("a2", "amit", "patel", 98));
		marksheets.add(new marksheet("a3", "ashutos", "chouhan",56));
		marksheets.add(new marksheet("a4", "anand", "rustom", 45));
		
		Collections.sort(marksheets,new orderbycondition());
		for(Object o : marksheets) {
			System.out.println(o);
			
		}
		
	}

}

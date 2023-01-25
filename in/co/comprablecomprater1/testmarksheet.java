package in.co.comprablecomprater1;

import java.util.ArrayList;
import java.util.Collections;

import in.co.collectionframework.collection;

public class testmarksheet {
	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();
		
		marksheets.add(new marksheet("sumit", "patel", "a1", 56));
		marksheets.add(new marksheet("sudeep", "sonaniya", "a2", 57));
		
		marksheets.add(new marksheet("loken", "mewada", "a3", 59));
		marksheets.add(new marksheet("aman", "verma", "a4",48));
		
		Collections.sort(marksheets,new orderbycondition());
		for(Object o :marksheets) {
			System.out.println(o);
		}
		
	}

}

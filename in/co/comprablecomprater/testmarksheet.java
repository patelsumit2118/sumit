package in.co.comprablecomprater;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import in.co.collectionframework.collection;

public class testmarksheet {
	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();
		marksheets.add(new marksheet("a2", "sumit", "patel", 81));
		marksheets.add(new marksheet("a3", "kapil", "patel", 67));
		marksheets.add(new marksheet("a4", "nainshi", "chouhan", 95));
		marksheets.add(new marksheet("a5", "hiten", "patel", 45));

		Collections.sort(marksheets, new orderbycondition());
		for (Object o : marksheets) {
			System.out.println(o);

		}
	}

}

package in.co.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class set {
	
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("sumit");
		hs.add("aman");
		
		hs.add(10);
		hs.add("");
		hs.add("vivegam");
		hs.add(100);
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		while(it.hasNext());{
			System.out.println(it.next());
		}
	}

}

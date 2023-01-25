package in.co.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map {
	 public static void main(String[] args) {
		
		 HashMap map = new HashMap();
		 map.put("ra01", "sumit");
		 map.put("rb02", "amit");
		 map.put("103", "rahul");
		 map.put("104", "suresh");
		 map.put("105", "nainshi");
		 
		 System.out.println(map.get("105"));
		 
		 Set keys = map.keySet();
		 Iterator it = keys.iterator();
		 
		 System.out.println("Keys of map");
		 while (it.hasNext()) {
			 System.out.println(it.next());
			 
			 
			 
		 }
		 Collection vals = map.values();
		 it = vals.iterator();
		 System.out.println("values of map");
		 while (it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
	}

}

package in.co.collect;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class testmarksheet {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		marksheet m1 = new marksheet("dc100","sumit", 58, 57, 33);
		marksheet m2 = new marksheet("dc102", "sumit", 57, 58, 37);
		
		HashMap map = new HashMap();
		map.put(m1, "sumit");
		System.out.println(map.get(m1));
		
		l.add(m1);
		l.add(m2);
		
		l.remove(m1);
		System.out.println(l.contains(m1));
		System.out.println(l.contains(m2));
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			marksheet m = (marksheet)it.next();
			System.out.print(" "+m.getName());
			System.out.print(" "+m.getRollNo());
			System.out.print(" "+m.getPhysics());
			System.out.print(" "+m.getChemistry());
			System.out.print(" "+m.getMaths());
			System.out.println();
		}
		
		
	}

}

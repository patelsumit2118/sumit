package in.co.collectionframework;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class queue {
	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		q.offer("ram");
		q.offer("shyam");
		q.offer("vijay");
		q.offer("mohan");
		q.offer("ajay");
		q.offer("shailendra");
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q);
		
		
	}

}

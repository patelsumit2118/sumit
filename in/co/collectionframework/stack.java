package in.co.collectionframework;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		
	
	Stack stack = new Stack();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	}
}

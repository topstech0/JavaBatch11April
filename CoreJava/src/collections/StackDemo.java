package collections;

import java.util.Stack;

/*
 * Stack : it follows in LIFO order. i.e Last In First Out.
 * 
 * 
 */

public class StackDemo {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(10);
		st.push(10.10);
		st.push('c');
		st.push("tops");
		st.push(null);
		st.push(true);
		st.push(10);
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		//System.out.println(st.pop());
		
		
	}
}

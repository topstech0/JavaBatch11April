package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Collections : it is a group of data.
 * 
 * 	Like in array, it is also a group of data, but of similar types.
 * 
 * whereas, In C Programming we have Structure, 
 * 			In Java we have Collections.
 * 
 * Collections: In Java , Collections provide some predefined interfaces to use for the 
 * 				application development.
 * 
 * 			E.g  i) List interface ii) Set interface iii)Map interface ,etc
 * 			
 * 
 * ArrayList : it is a Dynamic List.
 * 	
 *  - It is similar like an Array, but ArrayList stores the value of multiple types.
 *  - since it is similar like an Array the indexing starts with 0.
 *  - In ArrayList Duplicate values are allowed.
 *  - The insertion order is maintained.
 *  - ArrayList is a class which is implemented by List interface and extended by List class.
 * 
 * -Iterator interface:
 * 
 *  - it contains iterator method inside it, which is use to individually access the elements.
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add('t');
		al.add("tops");
		al.add(10);
		al.add(null);
		al.add(true);
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.indexOf('t'));
		System.out.println(al.get(5));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(4, 10));
		System.out.println(al);
		al.add(6, null);
		System.out.println(al);
		
		System.out.println("\nPrinting through - Iterator interface.\nTop-Botton Approach. \n");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator litr = al.listIterator();
		System.out.println("\nPrinting through - ListIterator interface.\nTop-Bottom Approach. \n");
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("\nPrinting through - ListIterator interface.\nBottom-Top Approach. \n");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}
	
}









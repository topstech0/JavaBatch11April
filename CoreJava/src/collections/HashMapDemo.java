package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

/*
 * HashMap : it internally implements Set interface and extends abstract class Set.
 * 			
 * imp note: 
 * 
 * 	- HashMap works with Key/Value pair.
 *  - Every Key is unique.
 *  - One Key contains only One Value.
 *  - You can access the value through the Key.
 *  
 *  - entrySet () : it will consider the Key/Value only One Pair.
 */

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "Ramesh");
		hm.put(2, "Suresh");
		hm.put(3, "Mangesh");
		hm.put(4, "Mahesh");
		hm.put(5, "Rajesh");
		hm.put(5, "Haresh");
		
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.remove(5));
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
				
	}
}

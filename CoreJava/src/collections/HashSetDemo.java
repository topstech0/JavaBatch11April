package collections;

import java.util.HashSet;

/*
 * HashSet : it is a class which is internally implemented by Set interface and Set abstract class.
 *         - No Duplicate Values are allowed.
 *         - Insertion order is not maintained, because it is managed by HashFunction/Table.
 *  	   - HashSet is Dynamic, it stores multiple values of multiple types.
 * 
 */

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add('t');
		hs.add("tops");
		hs.add(10);
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.size());
	}

}

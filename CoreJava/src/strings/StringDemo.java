package strings;

/*
 * String and StringBuffer
 * 
 * 
 * String : it is a collection of characters.
 * 			- it is mutable i.e you cannot change the string once it is assigned.
 * 			- it is slow in performance as compared with StringBuffer Class.
 * 
 * StringBuffer : it is immutable. you can change the string once it is assigned.
 * 				 - it is faster in performance as compared to String Class.
 * 
 * 
 */

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String("This is Tops Technologies.");
		System.out.println("Original String : "+s1);
		System.out.println("Length of String : "+s1.length());
		System.out.println("String in Uppercase : "+s1.toUpperCase());
		System.out.println("String in Lowercase : "+s1.toLowerCase());
		System.out.println("Sub-String (Begin Index): "+ s1.substring(3));
		System.out.println("Sub-String (Begin and End Index) : "+s1.substring(6, 16));
		
		System.out.println("String charAt() : "+s1.charAt(6));
		
		String s2 = "Rakesh Kharva";
		
		if(s1.equals(s2))
		{
			System.out.println("Both the String are equal.");
		}
		else
		{
			System.out.println("Both the String are inequal.");
		}
		
		
	}

}










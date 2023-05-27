package generics;

/*
 * Generic : It provides the Common Data type. 
 * 			- it denotes with <>
 * 
 * imp note: It provides the Type Safety.
 * 
 * 
 * - Java provides predefined and user-defined generics
 * 
 * -> In Generics you can pass only reference data types.
 * -> within <> it will only be a Reference type value 
 * -> It cannot have a Primitive Datatype within <>.
 * 
 *  <E> it is a predefined Generic Class.
 */


public class GenericsDemo {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E e : inputArray)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] =  {10,20,30,40,50};
		Character charArray[] = {'t','o','p','s'};
		Float floatArray[] = {10.1f,20.2f,30.3f,40.4f,50.5f};
		String stringArray[] = {"tops"};
		Double doubleArray[] = {32.43,54.43,45.12,432.323};
		
		
		System.out.println("Integer Array : ");
		printArray(intArray);
		
		System.out.println("\nCharacter Array : ");
		printArray(charArray);
		
		System.out.println("\nFloat Array :");
		printArray(floatArray);
		
		System.out.println("\nString Array :");
		printArray(stringArray);
		
		System.out.println("\nDouble Array :");
		printArray(doubleArray);
	} 
}

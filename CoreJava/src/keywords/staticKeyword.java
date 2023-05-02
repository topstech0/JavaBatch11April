package keywords;

import java.util.Scanner;

/*
 * static : it is a keyword, which is declared to a variable, method.
 * 
 * - When the static methods are created, you do not need to create the object to call this method.
 *  Because it can be called by its name.
 *  
 *  - Static block are called before main method.
 *  
 *  - it is use for Common Memory Management.
 * 
 * - if you declare the method as static you can use only static members.
 * 
 * - Normal blocks are called immediately after the object creation.
 * 
 * 
 */


class staticDemo{
	
	static int a;
	Scanner sc = new Scanner(System.in);
	
	void setVal()
	{
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void getVal()
	{
		System.out.println("A : "+a);
	}
	
}

public class staticKeyword {
	
	
	public static void main(String[] args) {
		
		staticDemo s1 = new staticDemo();
		staticDemo s2 = new staticDemo();
		staticDemo s3 = new staticDemo();
		
		
		s1.setVal();
		s2.setVal();
		s3.setVal();
		
		s1.getVal();
		s2.getVal();
		s3.getVal();
		
	}

}

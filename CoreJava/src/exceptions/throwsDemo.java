package exceptions;

import java.util.Scanner;

/*
 * throws : it is a keyword, which is used under Checked Exception.
 * 
 * - throws works with the method signature.
 * 
 * e.g void show() throws Exception
 * 	  {
 * 			//statement
 * 	  }
 * 
 * - throws is an alternative of try/catch
 * 
 * - where there is throws you cannot use try/catch block inside that method.
 * 
 * 
 */




public class throwsDemo {
	
	public static void demo() throws Exception
	{
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X : ");
		x = sc.nextInt();
		
		if(x>0)
		{
			System.out.println("Square : "+(x*x));
		}
		else
		{
			throw new Exception("Please Enter +ve Value.");
		}
	}
	
	
	
	public static void main(String[] args)  {
		try {
			demo();
		} catch (Exception e) {
			System.out.println(e);			
		}
	}

}

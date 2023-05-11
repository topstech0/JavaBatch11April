package exceptions;
/*
 * throw : it is a keyword, which comes under the Checked Exception.
 * 
 * 		 - it is mainly used to throw the exception explicitly.
 * 
 * 
 *  Rules for using the throw keyword.
 *  
 *  1) throw keyword will be used in a block of code or a method.
 *  2) once the throw keyword is used, you cannot write any statement after the throw keyword.
 *  3) throw keyword will be used along with the object of the particular class.
 * 
 */

import java.util.Scanner;

public class throwDemo {
	
	public static void demo()
	{
		int x=0;
		Scanner sc = new Scanner(System.in);
		
		try {
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
			
		} catch (Exception e) {
			System.out.println(e);
			demo();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		demo();
	}

}

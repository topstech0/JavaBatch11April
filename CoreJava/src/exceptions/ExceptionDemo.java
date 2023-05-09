package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : it is an abnormal situation that rises during the Runtime of the Program
 * 			   is called an Exception.
 * 
 * 			: it will not execute the next line, if the exception is generated at the very 
 * 			  previous line.
 * 
 *  There are 2 Types of Exception
 *  
 *  1) Checked Exception
 *  	- This exception are checked at compile time.
 *  
 *  2) Unchecked Exception
 *  
 *  	- This exception are generated at run time.
 * 			
 * 
 * To handle the exception, java has provided the 5 keywords.
 * 
 * 1) try
 * 2) catch
 * 3) finally
 * 4) throw
 * 5) throws
 * 
 * 
 * try : it is a block of code where it generates the exception.
 * 		- try block will never be alone, it will have atleast one catch block or finally block.
 * 		- try block can have more than one catch block.
 * 
 * catch : it is a block, where the exception is handle.
 * 
 * finally : even if the exception is not generated, it will any how execute the block.
 * 
 */

public class ExceptionDemo {
		
	public static void main(String[] args) {
	
		System.out.println("Start Code:");
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A : ");
			int a = sc.nextInt();
			System.out.println("Enter B : ");
			int b = sc.nextInt();
			float c  = a/b;
			System.out.println("Division : "+c);
			int arr[] = new int[2];
			System.out.println(arr[3]);
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Exception Caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Caught");
		}
		*/
		
		catch(Exception e)
		{
			System.out.println("Exception Caught."+e);
			//e.printStackTrace();
		}
		finally {
			System.out.println("Finally block is executed.");
		}
		
		
		
		
	}

}













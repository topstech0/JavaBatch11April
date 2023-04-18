package basic;

import java.util.Scanner;

/*
 * Conditional Statements: 
 * 
 * 1) Simple if
 * 2) if/else
 * 3) nested if/else
 * 4) ladder if/else
 * 5) switch statement
 * 
 * 1) Simple if :
 * 
 * 	syntax : if(condition)
 * 			 {
 * 				//statement
 * 			 }
 * 
 * 		-condition is a boolean value i.e true/false
 * 
 * 	
 * 2) Nested if/else
 * 
 * syntax : if(condition)
 * 			{
 * 				if(condition)
 * 				{
 * 					//statement
 * 				}
 * 				else
 * 				{
 * 					//statement
 * 				}
 * 
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 * 				{
 * 					//statement
 * 				}
 * 				else
 * 				{
 * 					//statement
 * 				}
 * 			}
 * 
 * 4) ladder if/else :
 * 
 * 	syntax :  if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else if(condition)
 * 			  {
 * 					statement
 * 			  }
 * 			  else
 * 			  {
 * 					statement
 * 			  }
 * 
 * 
 */


public class Test2 {

	public static void main(String[] args) {	
			
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N1 : ");
		n1 = sc.nextInt();
		System.out.println("Enter N2 : ");
		n2 = sc.nextInt();
		System.out.println("Enter N3 : ");
		n3 = sc.nextInt();
		System.out.println("N1 = "+n1+", N2 = "+n2+", N3 = "+n3);
		
		/*if(n>0)
		{
			System.out.println(n + " is +ve");
		}
		else
		{
			System.out.println(n+" is -ve");
		}
		*/
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1 + "is Greater");
			}
			else
			{
				System.out.println(n3+" is Greater");
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println(n2+" is Greater");
			}
			else
			{
				System.out.println(n3+" is Greater");
			}
		}
		
		
		
		
	}
}

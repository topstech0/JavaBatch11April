package basic;

import java.util.Scanner;


/*
 * Nested Loop : 
 * 
 * 			for(initialization;condition;updation)//outer loop /row
 * 			{
 * 				for(initialization;condition;updation) //innerloop /col
 * 				{
 * 					
 * 				}
 * 			}
 * 
 * 
 * 
 */


public class ForDemo {
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number.");
		int n = sc.nextInt();
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println(n+" X "+i + " = "+(n*i));
		}
		*/
		
		/*
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i=1;i<=10;i++)
		{
			for(int sp=i;sp<=10;sp++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
	}

}

package basic;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		int a = sc.nextInt();
		System.out.println("Enter B : ");
		int b = sc.nextInt();
		System.out.println("\nA = "+a+", B = "+b);
		System.out.println("\nPress 1. for Addition\nPress 2. for Subtraction\n Press 3. for Division\nPress 4. for Multiplication.");
		System.out.println("Enter your choice ?");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Addition : "+(a+b));
			   break;
		case 2:System.out.println("Subtraction: "+(a-b));
		   break;
		case 3:System.out.println("Division : "+((float)a/b));
		   break;
		case 4:System.out.println("Multiplication : "+(a*b));
		   break;
		default:
			System.out.println("Invalid Input");
		}
		
		
		
	}

}

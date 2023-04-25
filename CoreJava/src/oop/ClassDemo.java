package oop;

import java.util.Scanner;



public class ClassDemo {
	
	int age;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void getDetails()
	{
		System.out.print("Enter Age : ");
		age = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
	}
	
	void showDetails()
	{
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
	
	
	public static void main(String[] args) {
		
		ClassDemo cd = new ClassDemo();
		//new ClassDemo();
		cd.getDetails();
		cd.showDetails();
		
	}

}

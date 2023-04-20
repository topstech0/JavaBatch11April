package basic;

import java.util.Scanner;

public class LadderifDemo {

	public static void main(String[] args) {
		
		int rollno,s1,s2,s3,tot;
		float per;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll No :");
		rollno = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Physics Marks : ");
		s1 = sc.nextInt();
		System.out.print("Enter Chemistry Marks : ");
		s2 = sc.nextInt();
		System.out.print("Enter Maths Marks : ");
		s3 = sc.nextInt();
		tot = s1+s2+s3;
		per = (float)tot/3;
		System.out.println("Roll No. "+ rollno);
		System.out.println("Name : "+name);		
		System.out.println("Total Marks Obtained : "+tot+"/ 300");
		System.out.println("Percentage Gained : "+per);
		System.out.print("Grade : ");
		if(per>=75)
		{
			System.out.print("Distinction");
		}
		else if(per>=60)
		{
			System.out.print("First Class");
		}
		else if(per>=50)
		{
			System.out.print("Second Class");
		}
		else if(per>=40)
		{
			System.out.print("Pass Class");
		}
		else
		{
			System.out.print("Fail!!");
		}
		
	}
	
}

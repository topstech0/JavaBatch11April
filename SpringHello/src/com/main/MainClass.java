package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		 Student s1 = (Student)a.getBean("s2");
		 System.out.println("ID : "+s1.getId());
		 System.out.println("First Name : "+s1.getFname());
		 System.out.println("Last Name : "+s1.getLname());
		 System.out.println("Email : "+s1.getEmail());
		 
	}

}

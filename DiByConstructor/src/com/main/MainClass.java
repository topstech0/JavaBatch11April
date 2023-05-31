package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		Student s1 = (Student)a.getBean("s1");
		
		System.out.println(s1);
		
	}

}

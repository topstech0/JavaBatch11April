package com.bean;

public class Student {

	int id;
	String fname,lname,email;	
	
	public Student(int id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	public String toString()
	{
		return "ID : "+id+"\nFirst Name : "+fname+"\nLast Name : "+lname+"\nEmail : "+email;
	}
	
	
	
	
	
}

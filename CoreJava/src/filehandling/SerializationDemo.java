package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serialization : To write the current status of an object into the file
 * 					is called Serialization.
 * 
 * 				: it helps in Security.
 * 
 * De-serialization : To read the current status of an object from the file
 * 					is called De-serialization.
 * 
 * 
 * Serializable interface : it is Marker interface.
 * 							- Because it does not contain any methods inside it.
 * 
 * 
 * 
 * toString() : it belongs to the String class.
 * 			  : it converts the data into String.
 * 
 *  imp note  : it will get automatically called, when you print the object of the class.
 * 
 * 
 */



class Employee implements Serializable{
	
	int eno;
	String ename;
	double salary;
	
	
	public Employee(int eno, String ename, double salary) {
		
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Eno : "+this.eno+"\nEname : "+this.ename+"\nSalary : "+this.salary;
	}
	
	
}






public class SerializationDemo {
	
	public static void main(String[] args) throws Exception {
	
		Employee e1 = new Employee(1,"Himesh",50000);
		
		//System.out.println(e1);
		
		
		// Writing object into the file - Serialization
		FileOutputStream fos = new FileOutputStream("ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.flush();
		oos.writeObject(e1);
		oos.close();
		System.out.println("\nObject written successfully.");
		
		
		//Reading object into the file - Deserialization.
		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		System.out.println(e2);
				
	}

}










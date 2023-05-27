package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * Userdefined generics : to use user-define generic,we need to implement
 * 						 interface.
 * 
 * To compare , we will use Comparator interface.
 * 
 * 
 */


class Employee
{
	int eid;
	String ename;
	float salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}	
}



public class ComparatorDemo implements Comparator<Employee>{

	
	public int compare(Employee e1, Employee e2) {

		int value = 0;
		
		if(e1.getSalary()>e2.getSalary())
		{
			value = -1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value = 0;
		}
			
		return value;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setEid(10);
		e1.setEname("Rajesh");
		e1.setSalary(50000);
		
		Employee e2 = new Employee();
		e2.setEid(20);
		e2.setEname("Ramesh");
		e2.setSalary(30000);
		
		Employee e3 = new Employee();
		e3.setEid(30);
		e3.setEname("Rakesh");
		e3.setSalary(40000);
		
		Employee e4 = new Employee();
		e4.setEid(40);
		e4.setEname("Ranesh");
		e4.setSalary(60000);
		
		Employee e5 = new Employee();
		e5.setEid(50);
		e5.setEname("Ralesh");
		e5.setSalary(50000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new ComparatorDemo());
		
		for(Employee e : list)
		{
			System.out.println("\nEid : "+e.getEid()+"\nName : "+e.getEname()+"\nSalary : "+e.getSalary());
		}
	
		
	}

}












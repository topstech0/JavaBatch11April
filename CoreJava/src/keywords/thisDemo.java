package keywords;

/*
 * this : it is a keyword , which says that it belongs to the current class.
 * 
 * 
 * 
 */


class Employee{
	
	int id;
	String name;
	double sal;
	
	Employee(int id,String name,double sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void showDetails()
	{
		System.out.println("Id : "+this.id+"\nName : "+this.name+"\nSalary : "+this.sal);
	}
	
	
}


public class thisDemo {
	public static void main(String[] args) {
	
		Employee e= new Employee(317,"Nikunj",15000);
		e.showDetails();
		
		
	
	}

}

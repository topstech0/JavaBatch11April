package oop;

/*
 * Polymorphism : poly -> Many
 * 				  morphism -> Forms
 * 
 *  - it is a combination of Many Forms.
 *  
 *  There are 2 types of Polymorphism
 *  
 *  1) Compile Time Polymorphism or Static Polymorphism or Early Binding Polymorphism.
 *  
 *  	e.g Method Overloading
 *  
 *  2) Run Time Polymorphism or Dynamic Polymorphism or Late Binding Polymorphism.
 *  
 *  	e.g Method Overriding.
 *   * 
 *
 * 
 * Method Overloading : 
 * 
 * -Same Method name
 * -Different Parameters/arguments
 * - Different return type.
 * 
 * 
 */


class methodOvr{
	
	void common()
	{
		int a=5,b=8;
		System.out.println("Add : "+(a+b));
	}
	
	void common(String name)
	{
		System.out.println("Name : "+name);
	}
	
	int common(int a,int b)
	{
		return a*b;
	}
	
	void common(int v)
	{
		if(v%2==0)
		{
			System.out.println("It is Even.");
		}
		else
		{
			System.out.println("It is Odd.");
		}
	}
	
	
}




public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		methodOvr mo = new methodOvr();
		mo.common();
		mo.common("Tops");
		mo.common(5);
		int val = mo.common(5,9);
		System.out.println("Multiplication : "+val);
		//System.out.println(mo.common(5,9));
		
		
	}

}

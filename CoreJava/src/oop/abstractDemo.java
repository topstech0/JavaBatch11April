package oop;

/*
 * Abstraction : it is hiding the internal implementation and show the essential 
 * 				 feature is called Abstraction.
 * 
 * 				e.g Air.
 * 
 * 
 * 
 * abstract class: 
 * 
 *  - An abstract class will contain abstract and non-abstract method.
 *  
 *  e.g abstract method : this method will not have the body, they will have only 
 *  					  the declaration.
 *  
 *  					abstract void show();
 *  				
 * 						it is called as concrete method.
 * 
 * e.g non-abstract method : this method will have the body.
 * 
 * 						void show()
 * 						{
 * 							
 * 						}
 * 
 * - Abstract class provides Partial Abstraction.
 * 
 * - We cannot create an object of abstract class.
 * 
 * - When you declare the abstract method,it is compulsory to implement this method
 *   inside that class which it is inheriting it.
 * 
 */


abstract class abs1{
	
	abstract void show(); //Abstract Method.
	
	void display()
	{
		System.out.println("Non-Abstract Method in abstract class.");
	}	
}

class abs2 extends abs1{

	
	void show() {
		System.out.println("Abstract Method implemented in Non-abstract class.");
	}
	
}

public class abstractDemo {
	
	public static void main(String[] args) {
		
		//abs1 a = new abs1();  Cannot create object of abstract class
		
		abs2 a1 = new abs2();
		a1.display();
		a1.show();
		
	}

}

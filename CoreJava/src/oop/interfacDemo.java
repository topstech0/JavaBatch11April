package oop;

/*
 * interface : it is syntactically like a class,but it is not a class.
 * 
 * - interface provides Full Abstraction.
 * 
 *  -since it is not a class, you cannot create the object of interface.
 *  
 *  -by default the method inside interface are all abstract.
 *  
 *  - to use inheritance of interface with class, we make use of implements keyword.
 *  
 *  - you can implement more than one interface with a class, so here it is an alternative for 
 *    multiple inheritance.
 *    
 *   - interface inheritance is also possible
 *   
 *   imp note : if the method inside interface is declared, so it is compulsory to use that 
 *              method in that class which it is inheriting it.
 *   
 *   			: you can create only static method inside the interface.
 *   
 *   */


interface ifs1{
	
	void d1();
	
}

interface ifs2 extends ifs1{
	void d2();
}

class X implements ifs2{

	@Override
	public void d1() {
		System.out.println("ifs1 method implemented in class X.");
		
	}

	@Override
	public void d2() {
		System.out.println("ifs2 method implemented in class X");
		
	}
	
}



public class interfacDemo {

	public static void main(String[] args) {
		
		X obj1 = new X();
		obj1.d1();
		obj1.d2();
		
	}
}

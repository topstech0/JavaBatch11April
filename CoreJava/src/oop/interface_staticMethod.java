package oop;

interface ifs3{
	
	static void meth()
	{
		System.out.println("Static Method in interface.");
	}
}


public class interface_staticMethod {
	
	public static void main(String[] args) {
		ifs3.meth();
	}

}

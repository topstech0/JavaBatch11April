package basic;

/*
 * Constructor : it is a special member, whose name is same as class name. * 
 * 				- It is use to initialize the members of the class.
 * 				- it does not have return type.
 
 		imp note: It is called automatically when the objects of the class are created.
 		
 		There are 3 types of Constructors.
 		
 		1) Default Constructor or Parameterless Constructor.
 		
 			syntax : class-name()
 					 {
 					 	//statement
 					 }
 		
 		2) Parameterized Constructor
 		
 			syntax : class-name(parm1,parm2..)
 					 {
 					 	//statement
 					 }
 		
 		3) Copy Constructor : here the object is pass as an argument
 		
 			syntax: class-name(class-name obj)
 					{
 						statement
 					}
 * 
 *  
 * 
 */


public class Box {
	
	double width,height,depth;
	
	Box()
	{
		System.out.println("Default Constructor Called.");
		width = 5;
		height = 4;
		depth = 3;
	}
	
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor Called.");
		width = w;
		height = h;
		depth = d;
	}
	
	Box(Box b)
	{
		System.out.println("Copy Constructor Called.");
		width = b.width;
		height = b.height;
		depth = b.depth;
		
	}
	
	void volume()
	{
		System.out.println("Volume of Box : "+(width*height*depth));
	}
	
	
	public static void main(String[] args) {
		Box obj1 = new Box();
		obj1.volume();
		
		Box obj2 = new Box(7,3,6);
		obj2.volume();
		
		Box obj3 = new Box(obj2);
		obj3.volume();
	}

}








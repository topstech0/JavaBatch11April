package keywords;

/*
 * final :  it is a keyword, which you can declare to a variable,method and class.
 * 
 * 			- When you declare the variable as final, you cannot change its value throughout 
 * 			  the program.
 * 
 * 			- When you declare the method as final, you cannot override the method.
 * 
 * 			- When you declare the class as final, you cannot inherit the class.
 * 
 * 
 */


class final1{

	//final int val = 10;
	int val;
	final void showVal()
	{
		//val = 54;
		System.out.println("Value : "+val);
	}
}


final class final2 extends final1{
	
	//void showVal()
	{
		
	}
	
}

/*class final3 extends final2{
	
}
*/


public class finalDemo {
	
	public static void main(String[] args) {	
		final1 f1 = new final1();
		f1.showVal();
	}

}

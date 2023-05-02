package keywords;

public class staticMethod {
	
	static int a = 10;
	static int b;
	
	 static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	
	 {
		 System.out.println("Block 1 Called.");
	 }
	 
	static {
		System.out.println("Static Block initialized");
		b = a*a;
	}
	
	{
		System.out.println("Block 2 Called.");
	}
	
	public static void main(String[] args) {
		
		staticMethod s = new staticMethod();
		//s.meth(10);
		meth(10);
	}

}

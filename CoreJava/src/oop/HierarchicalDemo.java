package oop;

import java.util.Scanner;

class Side{
	protected int l;
	
	void getl(int l)
	{
		this.l = l;
	}	
}

class Square extends Side{
	
	int Sqr()
	{
		return (l*l);
	}
}

class Cube extends Side{
	
	int cub()
	{
		return (l*l*l);
	}
}




public class HierarchicalDemo {
	public static void main(String[] args) {
		Square s = new Square();
		s.getl(5);
		System.out.println("Square is : "+s.Sqr());
		
		Cube c = new Cube();
		c.getl(7);
		System.out.println("Cube  is : "+c.cub());
				
		
	}

}

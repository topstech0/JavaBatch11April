package strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This is StringBuffer Demo.");
		
		System.out.println("Original String : "+sb);
		System.out.println("Length of String : "+sb.length());
		
		sb.insert(0, "hii");
		System.out.println("Original String : "+sb);
		System.out.println("Length of String : "+sb.length());
		
		sb.append("Rakesh Kharva.");
		System.out.println("Original String : "+sb);
		System.out.println("Length of String : "+sb.length());
		
		System.out.println("Original String : "+sb);
		sb.delete(1, 3);
		System.out.println("String after delete : "+sb);
		System.out.println("Length of String : "+sb.length());
		
	}

}

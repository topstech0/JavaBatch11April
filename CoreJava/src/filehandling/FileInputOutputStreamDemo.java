package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * FileInputStream : Reading from the file.
 * 
 * 
 * FileOutputStream : Writing to the file.
 * 
 * 
 */

public class FileInputOutputStreamDemo {
	
	public static void main(String[] args) throws Exception {
		
		//Writing to the File
		FileOutputStream fos = new FileOutputStream("t1.txt");
		String s = "This is File Input/Output Stream Demo.";
		byte [] b = s.getBytes();		
		
		fos.flush();
		fos.write(b);
		fos.close();
		
		//Reading from the File.
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	
		
		
		
		
		
	}

}

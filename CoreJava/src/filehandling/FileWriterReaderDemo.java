package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWrite : write to a file.
 * 
 * FileReader : Read from the file.
 * 
 * 
 */



public class FileWriterReaderDemo {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("t2.txt");
		String s = "This is FileWriter/Reader Demo.";
		fw.flush();
		fw.write(s);
		fw.close();
		System.out.println("File Written Successfully.");
		
		FileReader fr = new FileReader("t2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		
	}

}

package filehandling;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File f = new File("ser.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getFreeSpace());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	}

}

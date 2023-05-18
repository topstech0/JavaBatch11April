package multithreading;

/*
 * To use Thread, there are two ways
 * 
 * 1) To implements Runnable interface
 * 2) To extend the Thread class.
 * 
 * 
 */

public class NewThread extends Thread{
	
	
	public NewThread() {
		super("Child Thread");
		start();		
	}
	
	
	
	public void run()
	{
		try {
			
			for(int i =1;i<=5;i++)
			{
				System.out.println(this+" : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting.");
	}
	
	
	
	public static void main(String[] args) {
		
		new NewThread();
	}

}

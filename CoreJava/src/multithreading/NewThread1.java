package multithreading;

public class NewThread1 implements Runnable{
	
	Thread t;
	String tname;
	
	
	public NewThread1(String tname) {
		this.tname = tname;
		t = new Thread(this,tname);
		t.start();
	}



	public void run() {
		
		try {
			for(int i = 1;i<=5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread Exiting.");		
	}

	
	
	public static void main(String[] args) {
		new NewThread1("One");
		new NewThread1("Two");
		new NewThread1("Three");
		
	}

	
}

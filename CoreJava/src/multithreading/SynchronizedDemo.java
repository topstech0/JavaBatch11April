package multithreading;

/*
 * Thread Synchronization : it is a process where it will execute the current Thread in
 * 							process and will lock the next Thread until the current Thread
 * 							process is not completed.
 * 
 * 						- To avoid Thread synchronization, we make use of synchronized keyword/block. 
 *  
 */



class Caller
{
	public void call(String msg)
	{
		try {
			System.out.print("["+msg);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Callback implements Runnable
{
	Thread t;
	String msg;
	Caller c;	
	
	
	public Callback(String msg, Caller c) {		
		this.msg = msg;
		this.c = c;
		t = new Thread(this);
		t.start();
	}

	public void run() {		
		
		synchronized(c)
		{
			c.call(msg);
		}
		
	}
	
}

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		
		Caller c = new Caller();
		Callback c1 = new Callback("Hello",c);
		Callback c2 = new Callback("World",c);
		Callback c3 = new Callback("Synchronized",c);
	}

}

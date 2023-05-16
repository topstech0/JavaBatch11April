package multithreading;

/*
 * Thread : A smallest individual unit of a program is called a Thread.
 * 
 *			- Java has provided the inBuilt Thread with class name as Thread.
 *
 * By Default the Thread provides the 3 default arguments.
 * 
 * 1st argument : it is the name of the Thread.
 * 				 - by default the name of the thread is main.
 * 
 * 2nd argument : it is the priority of the Thread.
 * 				 - by default the priority is Normal Priority whose value is 5.
 *
 *				- There are 3 priorities
 *
 *				1) MIN_Priority : value is 1.
 *				2) NORM_Priority : value is 5.
 *				3) Max_Priority  : value is 10.
 *
 * 3rd argument : it is the name of the thread group.
 * 				 - by default the group name is main.
 * 
 * 
 */


public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		
		t.setName("My Thread");
		System.out.println("After Name Change : "+t);
		
		t.setPriority(5);
		System.out.println("After Priority Change :"+t);
		
		
			
			try {
				for(int i = 1;i<=5;i++)
				{
					System.out.println(t+" : "+i);					
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}



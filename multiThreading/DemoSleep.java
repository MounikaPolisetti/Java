package multiThreading;

/*
 * Sleep will make the current thread sleep for specified time (not runnable-state) and
 *  will not release the lock/monitor to other threads
 */
public class DemoSleep extends Thread {

	public synchronized void run(){
		for(int i=1;i<=5;i++)
		System.out.println(Thread.currentThread().getName()+" Counting"+ i);
	}
	public static void main(String[] args) {
		DemoSleep t1=new DemoSleep();
		DemoSleep t2=new DemoSleep();
		
		t1.start();
		try {			
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();	
	}
}

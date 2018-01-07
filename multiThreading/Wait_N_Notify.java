package multiThreading;
/*
 * Wait will freeze the current thread ( MOVE TO not runnable-state) and
 * Release the lock/monitor to other threads.
 *  it will wait in wait queue until other thread calls notify() or notifyAll().
 */	
public class Wait_N_Notify{
		
	public static void main(String[] args) {
		Second thread1=new Second();
		Second thread2=new Second();
		
		thread1.start();
		thread2.start();
		synchronized(thread1) {
			try{					
				thread1.wait();
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("Run Done");
			}
		}
	}

class Second extends Thread{
	public static boolean val=false;

	public void run() {
		System.out.println(Thread.currentThread().getName()+" In run");
		int count=0;
		System.out.println("Inside callmethod 2");
		for(int i=0;i<100;i++){
			count++;
		}
		System.out.println(count);
		synchronized (this){		
			notify();
		}			
	}
}
		



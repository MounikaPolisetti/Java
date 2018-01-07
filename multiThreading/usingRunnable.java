package multiThreading;

public class usingRunnable implements Runnable{

	public static void main(String[] args) {
		usingRunnable tth1= new usingRunnable();
		Thread t1= new Thread(tth1);
		t1.start();
	}

	public void run() {
		System.out.println("Thread running");
		
	}

}

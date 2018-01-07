package multiThreading;

public class usingThreadClass extends Thread{

	public void run(){
		System.out.println("Thread runnung");
	}
	public static void main(String[] args) {
		usingThreadClass th1=new usingThreadClass();
		th1.start();
	}

}

package multiThreading;

public class Demo extends Thread{
	String name;
	
	Demo(String name){
		this.name=name;
	}
	
	public void run() {
		System.out.println(this.name + "running");
		System.out.println("Hello"+ this.name);

	}
	public static void main(String[] args) {
		Demo t1= new Demo("Thread1");
		Demo t2= new Demo("Thread2");
		Demo t3= new Demo("Thread3");
		t1.start();
		t2.start();
		t3.start();

	}

}

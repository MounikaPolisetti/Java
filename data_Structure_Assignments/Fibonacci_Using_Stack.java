package data_Structure_Assignments;

public class Fibonacci_Using_Stack {
	public static void fibonacci(int n){
		New_Stack ns=new New_Stack(n);
		ns.push(0);
		ns.push(1);
		
		for(int i=2;i<= n;i++){
			int top1=ns.pop();
			int top2=ns.pop();
			int result=top1+top2;
			System.out.println(result);
			ns.push(top2);
			ns.push(top1);
			ns.push(result);
		}
	
	}
	
	

	public static void main(String[] args) {
		int n=2,fib=1;
		Fibonacci_Using_Stack fus= new Fibonacci_Using_Stack();
		New_Stack ns=new New_Stack(n);
		
		if(n==0){
			System.out.println("Fibonacci of " + n+ " is " + -1);
			return;
		}
		else if(n==1){
			System.out.println("Fibonacci of " + n+ " is " + 0);
			return;
		}
		else{
			fibonacci(n);
		}
		
		/*else if(n==1){
			
			System.out.println("Fibonacci of " + n+ " is " + ns.pop());
			ns.push(1);
		}
		
		else if(n==2){
			ns.push(0);
			ns.push(1);
			System.out.println("Fibonacci of " + n+ " is " );
			ns.display();
		}
		else{
			for(int i=3;i<=n;i++){
				int onTop=ns.peek();
				if(onTop<=0){
					onTop=0;
				}
				int result=onTop+i;
				ns.push(result);
			}
			System.out.println("Fibonacci of " + n + " is "+ ns.pop());
		}*/
		
	}
}

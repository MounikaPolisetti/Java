package data_Structure_Assignments;
import data_Structure_Assignments.New_Stack;


public class Factorial_UsingStack {

	public static void main(String[] args) {
		int n=5,fact=1;
		Factorial_UsingStack fus= new Factorial_UsingStack();
		New_Stack ns=new New_Stack(n);
		if(n==0){
			System.out.println("Factorial of " + n+ " is " +fact);
		}
		else{
			for(int i=1;i<=n;i++){
				int onTop=ns.peek();
				if(onTop<=0){
					onTop=1;
				}
				int result=onTop*i;
				ns.push(result);
			}
			System.out.println("Factorial of " + n + " is "+ ns.pop());
		}
		
	}

}

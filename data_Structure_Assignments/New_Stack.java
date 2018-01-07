package data_Structure_Assignments;

public class New_Stack {

	public static int top=-1;
	public int size;
	public int[] a;
	
	New_Stack(int size){
		this.a=new int[size];
		this.size=size;
	}
	
	public boolean isFull(){
		return (top==size-1);
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(int element){
		if(isFull()){
			System.out.println("Stack is full");			
		}else{
			top++;
			a[top]=element;
			System.out.println(element+ " inserted");
		}
	}
	
	public int pop(){
		int temp=0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp=a[top];
			top--;			
		}
		return temp;
	}
	
	public int peek(){
		int temp=0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp=a[top];
			
		}
		return temp;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			System.out.println("Stack contains");
			for(int i=top;i>=0;i--){
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		New_Stack s= new New_Stack(5);
		s.push(1);
		s.push(10);
		s.push(100);
		s.push(1000);
		s.push(10000);
		s.display();
	
		int temp=s.peek();
		System.out.println(temp + " is the top element");
		System.out.println(".............");
		
		s.pop();
		s.display();
		System.out.println(".............");
		
		s.pop();
		s.display();
		System.out.println(".............");
		
		s.pop();
		s.display();
		System.out.println(".............");
		
		s.pop();
		s.display();
		System.out.println(".............");
		
		s.pop();
		s.display();
		System.out.println(".............");
		
		
	}

}


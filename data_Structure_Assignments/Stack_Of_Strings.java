package data_Structure_Assignments;

public class Stack_Of_Strings {
	
	public static int top=-1;
	public int size;
	public String[] a;
	
	Stack_Of_Strings(int size){
		this.a=new String[size];
		this.size=size;
	}
	
	public boolean isFull(){
		return (top==size-1);
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(String element){
		if(isFull()){
			System.out.println("Stack is full");			
		}else{
			top++;
			a[top]=element;
			System.out.println(element+ " inserted");
		}
	}
	
	public String pop(){
		String temp="";
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp=a[top];
			top--;			
		}
		return temp;
	}
	
	public String peek(){
		String temp="";
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
		Stack_Of_Strings s= new Stack_Of_Strings(5);
		s.push("Anu");
		s.push("Bina");
		s.push("Chaitra");
		s.push("Diya");
		s.push("Eira");
		s.display();
	
		String temp=s.peek();
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

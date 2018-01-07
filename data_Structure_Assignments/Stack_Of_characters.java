package data_Structure_Assignments;

public class Stack_Of_characters {
	public static int top=-1;
	public int size;
	public char[] a;
	
	Stack_Of_characters(int size){
		this.a=new char[size];
		this.size=size;
	}
	
	public boolean isFull(){
		return (top==size-1);
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(char element){
		if(isFull()){
			System.out.println("Stack is full");			
		}else{
			top++;
			a[top]=element;
			System.out.println(element+ " inserted");
		}
	}
	
	public char pop(){
		char temp=0;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp=a[top];
			top--;			
		}
		return temp;
	}
	
	public char peek(){
		char temp=0;
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
		Stack_Of_characters s= new Stack_Of_characters(5);
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');
		s.display();
	
		char temp=s.peek();
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

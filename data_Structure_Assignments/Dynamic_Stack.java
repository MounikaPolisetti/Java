package data_Structure_Assignments;

import java.util.Stack;
public class Dynamic_Stack{
	public static int top=-1;
	public int size;
	public int[] a;

	Dynamic_Stack(int size){
		this.a=new int[size*size];
		this.size=size;
	}

//	public boolean isFull(){
//		return (top==size-1);
//	}

	public boolean isEmpty(){
		return top==-1;
	}

	public void push(int element){
		top++;
		a[top]=element;
		System.out.println(element+ " inserted");
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
	
	public int increaseCapacity(int size){
		
		return this.size*size;
	}
	public static void main(String[] args) {
		int n=5;
		New_Stack s= new New_Stack(n*n);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.push(1);
		s.push(10);
		s.display();
	}
}

/*		public class Dynamic_Stack<T> {
			Stack<T> s1, s2;
			
		public Dynamic_Stack() {
			s1 = new Stack<T>();
			s2 = new Stack<T>();
		}

//		public int size() {
//			return s1.size();
//		}

		public void add(T value) {
			s1.push(value);
		}

		public T peek() {
			if (!s2.empty()) return s2.peek();
			return null;
			
		}

		public T pop() {
			if (!s2.empty()) 
				return s2.pop();
			
		}

		public static void main(String[] args) {

			Stack s1 = new Stack();
			
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.push(60);
			s1.push(70);
			System.out.println(s1);
			System.out.println(s1.peek());
			
		}	

	

}*/

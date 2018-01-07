package data_Structure_Assignments;

public class Stack_Of_Objects {
	public static int top=-1;
	public int size;
	public Student_Object[] a;
	
	Stack_Of_Objects(int size){
		this.a=new Student_Object[size];
		this.size=size;
	}
	
	public boolean isFull(){
		return (top==size-1);
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void push(Student_Object element){
		if(isFull()){
			System.out.println("Stack is full");			
		}else{
			top++;
			a[top]=element;
			
			System.out.println( "inserted--> "+element.toString());;
		}
	}
	
	public Student_Object pop(){
		Student_Object temp = null;
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			temp=a[top];
			top--;			
		}
		return temp;
	}
	
	public Student_Object peek(){
		Student_Object temp = null;
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
				System.out.println(a[i].toString());
			}
		}
	}
	/*public static void main(String[] args) {
		Stack_Of_Objects[] sob= new Stack_Of_Objects[5];
		Student_Object[] s= new Student_Object[5];
		s[0]=new Student_Object(11,"Abhi",80);
		sob.p
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
		
	
	}*/

	

}

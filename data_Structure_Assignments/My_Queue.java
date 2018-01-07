package data_Structure_Assignments;

public class My_Queue {
	public int front;
	public int rear=-1;
	public int[] queue;
	public int numOfElements;
	public int size;
	public int temp=0;
	My_Queue(int size){
		this.size=size;
		queue=new int[size];		
		
	}
	
	public boolean isEmpty(){	
		return (rear==-1);
	}
	
	public boolean isFull(){
		boolean res=false;
		return rear==(queue.length-1);
	}
	
	public int peek(){
		if(!isEmpty())
			temp=queue[front];
		System.out.println(temp +" is the top elememt");
			return temp;
	}
	
	public void display(){
		if(!isEmpty()){					
			for(int i=front;i<=rear;i++){
				System.out.println(queue[i] + " ");
			}
		}
		else{
			System.out.println("Queue is empty");
			return;
		}
	}

	public void push(int ele){
		if(!isFull()){
			rear++;
			queue[rear]=ele;
			System.out.println(ele+ " inserted");
		}else{
			System.out.println("cant insert Queue is full");
			return;
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			temp=queue[front];	
			front++;
		}
		else{
			System.out.println("Queue is empty");
			return 0;
		}
		return temp;
	}
	public static void main(String[] args) {
		My_Queue mq= new My_Queue(5);
		mq.push(10);
		mq.push(20);
		mq.push(30);
		mq.push(40);
		mq.display();
		mq.push(50);
		mq.display();
		mq.push(60);
		//mq.peek();
		mq.pop();
		System.out.println("after popping");
		mq.display();
		mq.pop();
		System.out.println("after popping");
		mq.display();
		mq.pop();
		System.out.println("after popping");
		mq.display();
		mq.pop();
		System.out.println("after popping");
		mq.display();
		mq.pop();
		System.out.println("after popping");
		mq.display();
		
		
	}

}

package data_Structure_Assignments;

public class Circular_Queue {
	
		public int front;
		public int rear;
		public int[] queue;
		public int currentSize;
		public int queueSize;
		public int temp=0;
		Circular_Queue(int size){
			front=0;
			rear=-1;
			currentSize=0;
			this.queueSize=size;
			queue=new int[size];
			
			
		}
		
		public boolean isEmpty(){	
			return (currentSize==0);
		}
		
		public boolean isFull(){
		
			return (currentSize==queueSize);
		}
		
		public int peek(){
			if(!isEmpty())
				temp=queue[front];
			System.out.println(temp +" is the top elememt");
				return temp;
		}
		
		
		public void display(){
			if(!isEmpty()){					
				if (rear >= front)
				{
					for (int i = front; i <= rear; i++)					
					System.out.println(queue[i]);
				}
				else
				{
					for (int i = front; i < queueSize; i++)
						System.out.println(queue[i]);
		 
					for (int i = 0; i <= rear; i++)
						System.out.println(queue[i]);
				}
			
			
			}
			else{
				System.out.println("Queue is empty");
				return;
			}
		}

		public void push(int ele){
			if(!isFull()){
				if(rear==queueSize-1){
					rear=(rear+1)%queueSize;				
				}	
				else{
					rear++;	
				}											
				queue[rear]=ele;
					System.out.println(ele+ " inserted");
					currentSize++;
				
				
			}else{
				System.out.println("cant insert Queue is full");
				return;
			}
			
		}
		
		public int pop(){
			if(!isEmpty()){
				if(front==queueSize-1){
					front=(front+1)%queueSize;
				}
				temp=queue[front];	
				front++;
				currentSize--;								
			}
			else{
				System.out.println("Queue is empty");
				return 0;
			}
			
			return temp;
		}
		public static void main(String[] args) {
			Circular_Queue cq= new Circular_Queue(5);
			cq.push(10);
			cq.push(20);
			cq.push(30);
			cq.pop();
			cq.push(40);
			cq.push(50);
			cq.push(60);
			System.out.println("Queue contains");
			cq.display();
			System.out.println("...........");
			cq.pop();
			cq.display();
			System.out.println("...........");
			cq.pop();
			cq.display();
			System.out.println("...........");
			cq.push(10);
			cq.display();
			cq.push(20);
			cq.display();
			cq.push(80);
			cq.display();
		}

	

}

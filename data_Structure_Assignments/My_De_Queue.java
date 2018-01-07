package data_Structure_Assignments;

public class My_De_Queue {
	public int ffront;
	public int frear;
	public int rfront;
	public int rrear;
	public int[] queue;
	public int numOfElements;
	public int size;
	public int temp=0;
	
	My_De_Queue(int size){
		this.size=size;
		queue=new int[size];
		 ffront=0;
		 frear=-1;
		 rfront=size-1;
		 rrear=size;
		
	}
	
	public boolean isEmpty(){	
		return (numOfElements==0);
	}
	
	public boolean isFull(){		
		return numOfElements==queue.length;
	}
	
	public int peekFront(){
		if(!isEmpty())
			temp=queue[ffront];
		System.out.println(temp +" is the top elememt");
			return temp;
	}
	
	public int peekRear(){
		if(!isEmpty())
			temp=queue[rfront];
		System.out.println(temp +" is the top elememt");
			return temp;
	}
	public void display(){
		if(!isEmpty()){					
			for(int i=ffront;i<=rfront;i++){
				System.out.println(queue[i] + " ");
			}
		}
		else{
			System.out.println("Queue is empty");
			return;
		}
	}

	public void pushAtFront(int ele){
		if((frear==-1) || !isFull() && numOfElements < size){
			frear++;
			queue[frear]=ele;
			numOfElements++;
			System.out.println(ele+ " inserted at front");
		}else{
			System.out.println("cant insert Queue is full");
			return;
		}
	}
	
	public void pushAtRear(int ele){
		if((rrear != size) || (!isFull() && numOfElements < size)){
			rrear--;
			queue[rrear]=ele;
			numOfElements++;
			System.out.println(ele+ " inserted at rear");
		}else{
			System.out.println("cant insert Queue is full");
			return;
		}
	}
	
	public int deleteAtFront(){
		if(!isEmpty()){
			temp=queue[ffront];				
			ffront++;
			numOfElements--;
		}
		else{
			System.out.println("Queue is empty");
			return 0;
		}
		return temp;
	}
	
	public int deleteAtRear(){
		if(!isEmpty()){
			temp=queue[rfront];
			rfront--;
			numOfElements--;
		}
		else{
			System.out.println("Queue is empty");
			return 0;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		My_De_Queue mq= new My_De_Queue(5);
		mq.pushAtRear(10);
		mq.pushAtRear(20);
		mq.pushAtFront(30);
		mq.pushAtFront(40);
		mq.pushAtFront(50);
		
		System.out.println(".....");
		mq.display();
		//mq.pushAtFront(60); // queue full
		
		mq.deleteAtFront();
		System.out.println(".....");
		mq.display();
		
		System.out.println(".....");
		mq.deleteAtRear();
		mq.display();
		
		System.out.println(".....");
		mq.deleteAtRear();
		mq.display();
		
		System.out.println(".....");
		mq.deleteAtRear();
		mq.display();
		System.out.println(".....");
		mq.deleteAtFront();
		mq.display();
	}
}

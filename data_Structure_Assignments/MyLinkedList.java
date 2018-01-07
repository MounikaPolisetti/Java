package data_Structure_Assignments;

import data_Structure_Assignments.Node;

public class MyLinkedList {
	Node head=null;
	
	public  void insertAtFront(int val){				
		Node n= new Node(val);
		if(head == null){	
			head=n;
		}
		else{
			n.next=head;
			head=n;			
		}
	}

	public  void insertAtEnd(int val){				
		Node n= new Node(val);
		if(head == null){	
			head=n;
		}
		else{
			Node prev=head,temp=head;
			while(temp.next != null){
				prev=temp;
				temp=temp.next;				
			}
			temp.next=n;			
		}
	}
	
	public void display(){
		if(head==null)
			return;
		else{
			Node temp=head;
			System.out.println("List contains");
			while(temp!=null){	
				System.out.println(temp.value);
				temp=temp.next;
			}
		}
	}
	
	public void deleteAtFront(){
		if(head==null){
			System.out.println("List is empty: No element to delete");
		}
		else{
			System.out.println(head.value+ " is the element deleted");
			head=head.next;
			System.out.println("New head is"+ head.value);
		}	
	}
	
	public void deleteAtEnd(){
		if(head==null){
			System.out.println("No element to delete");
		}
		else{
			Node prev=null,temp=head;
			while(temp.next != null){
				prev=temp;
				temp=temp.next;
			}
			System.out.println(temp.value+ " is the element deleted");
			prev.next=null;
		}	
	}
	
	public void deleteAtPosition(int pos){
		if(head==null){
			System.out.println("No element to delete");
		}
		else{
			Node prev=null,temp=head;
			for(int i=0;i<pos;i++){
				prev=temp;
				temp=temp.next;
			}
			System.out.println(temp.value+ " is the element deleted");
			prev.next=temp.next;
		}
	}
	public int findMin(){
		int min=999;
		if(head==null){
			System.out.println("List is empty");
			return -1;
		}
		else{
			Node temp=head;
			while(temp != null){
				if(temp.value < min){
					min=temp.value;
				}
				temp= temp.next;				
			}
		}
		return min;
	}
	
	public int findMax(){
		int max=0;
		if(head==null){
			System.out.println("List is empty");
			return -1;
		}
		else{
			Node temp=head;
			while(temp != null){
				if(temp.value > max){
					max=temp.value;
				}
				temp= temp.next;				
			}
		}
		return max;
	}
	public void addAfter(int eleToInsert, int afterThisEle){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		else{
			Node temp=head;
			while(temp != null){
				if(temp.value != afterThisEle){
					temp=temp.next;
				}
				else{
					Node n= new Node(eleToInsert);
					n.next=temp.next;
					temp.next=n;
					return;
				}
			}
			System.out.println(afterThisEle+" is not found in the list");
			return;
			
		}
	}
	public void deleteAfter(int deleteAfterThis){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		else{
			Node temp=head;
			while(temp != null){
				if(temp.value != deleteAfterThis){
					temp=temp.next;
				}
				else{
					temp.next=temp.next.next;
					return;
				}
			}
			System.out.println(deleteAfterThis+" is not found in the list");
			return;
			
		}
	}
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.display();
		//list.addAfter(5, 12);
		list.deleteAfter(7);
		list.display();
//		list.insertAtEnd(12);
//		list.insertAtEnd(14);
		//list.display();
		//list.deleteAtFront();
//		list.display();
//		list.deleteAtEnd();
//		list.display();
//		list.deleteAtPosition(3);
//		list.display();
//		int min=list.findMin();
//		System.out.println(min + " is the minimum value in the list");
//		int max=list.findMax();
//		System.out.println(max + " is the maximum value in the list");

	}

}

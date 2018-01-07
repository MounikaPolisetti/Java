package data_Structure_Assignments;

import data_Structure_Assignments.DLList_Node;

public class Doubly_LinkedList {
	DLList_Node head=null;
	
	public void insertAtEnd(int val){
		if(head == null){
			DLList_Node node=new DLList_Node(val);
			head=node;
		}
		else{
			DLList_Node temp=head;
			while(temp.next !=null){
				temp=temp.next;
			}
			DLList_Node node=new DLList_Node(val);
			temp.next=node;
			node.prev=temp;
		}
	}
	
	public void insertAtFront(int val){
		if(head == null){
			DLList_Node node=new DLList_Node(val);
			head=node;
		}
		else{
			DLList_Node node=new DLList_Node(val);
			head.prev=node;
			node.next=head;
			head=node;
		}
	}
	
	public void deleteAtFront(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}else{
			System.out.println(head.value + " is deleated");
			head=head.next;
			//head.prev=null;
		}
	}
	
	public void deleteAtEnd(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}else{
			DLList_Node temp=head;
			while(temp.next != null){
				temp=temp.next;
			}
			System.out.println(temp.value+ " is deleted");
			temp=temp.prev;
			temp.next=null;
		}
	}
	public void display(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		else{
			DLList_Node temp=head;
			System.out.println("List contains");
			while(temp != null){
				System.out.println(temp.value);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Doubly_LinkedList dlist = new Doubly_LinkedList();
		dlist.insertAtEnd(1);
		dlist.insertAtEnd(2);
		dlist.insertAtEnd(3);
		dlist.display();
		dlist.insertAtFront(1);
		dlist.insertAtFront(2);
		dlist.insertAtFront(3);
		dlist.display();
		dlist.deleteAtEnd();
		dlist.display();
	}

}

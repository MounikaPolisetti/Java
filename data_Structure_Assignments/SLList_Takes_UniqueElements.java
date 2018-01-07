package data_Structure_Assignments;

public class SLList_Takes_UniqueElements extends MyLinkedList {
	
	public void insert(int element){
		if(head == null){
			Node n = new Node(element);
			head=n;
		}
		else{
			Node prev=null,temp=head; 		
			while(temp != null){
				if(temp.value == element){
					System.out.println( "Cannot insert. " + element+" is not unique");
					return;
				}
				else{
					prev=temp;
					temp = temp.next;					
				}
			}
			Node n = new Node(element);
			prev.next=n;								
		}
		
	}

	public static void main(String[] args) {
		SLList_Takes_UniqueElements uniqlist = new SLList_Takes_UniqueElements();
		uniqlist.insert(10);
		uniqlist.insert(20);
		uniqlist.insert(30);
		uniqlist.insert(40);
		uniqlist.display();
		uniqlist.insert(10);
		//uniqlist.display();

	}

}

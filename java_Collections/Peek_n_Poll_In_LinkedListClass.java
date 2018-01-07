package java_Collections;

import java.util.LinkedList;

public class Peek_n_Poll_In_LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(2); //add appends the element to the end of list --- equivalent to --> addLast()
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(5);
		ll.addFirst(1);
		ll.addLast(6);
		System.out.println(ll);
		
		System.out.println("peek: " +ll.peek()); //returns the first element
		System.out.println("peek First: "+ ll.peekFirst());	//returns first element
		System.out.println(ll);
		
		System.out.println("peek Last: "+ ll.peekLast());	//returns last element
		System.out.println(ll);
		
		System.out.println("poll "+ ll.poll()); 	//poll deletes first element
		System.out.println(ll);
		
		System.out.println("pollFirst: "+ ll.pollFirst());	//pollFirst deletes first element
		System.out.println(ll);
		
		System.out.println("poll Last: "+ ll.pollLast());	//pollLast deletes last element
		System.out.println(ll);
		
		System.out.println("pop "+ ll.pop()); //deletes first element
		System.out.println(ll);
		
		System.out.println("Before pushing element");
		System.out.println(ll);
		
		ll.push(10);				//appends the element to the beginning of list --- equivalent to --> addFirst()
		System.out.println("After pushing element 10 into list");
		System.out.println(ll);
		
	}

}

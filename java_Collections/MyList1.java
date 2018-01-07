package java_Collections;

import java.util.LinkedList;

import java.util.Iterator;
//Store 4 string elements and print the contents in reverse order without using for/while
public class MyList1 {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("Anu");
		al.add("Banu");
		al.add("Chinnu");
		al.add("dinu");
		
		Iterator s=al.descendingIterator();
		while(s.hasNext())
			System.out.println(s.next());
	}
	
	

}

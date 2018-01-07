package java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintArrayListContentsUsingWhileLoop {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anu");
		al.add("Banu");
		al.add("Chinnu");
		al.add("dinu");
		
		//System.out.println(al); //To print contents in one line
		
		Iterator i= al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
//		for(String s:al)		//To print contents using for loop
//			System.out.println(s);
//		
	}

}

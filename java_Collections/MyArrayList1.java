package java_Collections;

import java.util.ArrayList;
//Store 4 string elements and print the contents in reverse order without using for/while
public class MyArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anu");
		al.add("Banu");
		al.add("Chinnu");
		al.add("dinu");
		System.out.println(al.get(3));
		System.out.println(al.get(2));
		System.out.println(al.get(1));
		System.out.println(al.get(0));

	}
	
	

}

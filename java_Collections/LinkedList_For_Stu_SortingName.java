package java_Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedList_For_Stu_SortingName implements Comparator<Student1> {

	public static void main(String[] args) {
		LinkedList<Student1> list= new 	LinkedList<Student1>();
		list.add(new Student1("Eena", 101));
		list.add(new Student1("Bindu", 102));
		list.add(new Student1("Abhi", 102));
		list.add(new Student1("Ina", 103));
		list.add(new Student1("Diya", 104));
		System.out.println("Before sorting");
		System.out.println(list);		
		Collections.sort(list, new LinkedList_For_Stu_SortingName());
		System.out.println("After sorting");
		System.out.println(list);
		
		/*Works directly for primitive type
		 * 
		LinkedList l=new LinkedList();
		l.add(3);
		l.add(1);
		l.add(8);
		l.add(5);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		*/


	}

	@Override
	public int compare(Student1 stu1, Student1 stu2) {
		
		return stu1.name.compareTo(stu2.name);
	}

}

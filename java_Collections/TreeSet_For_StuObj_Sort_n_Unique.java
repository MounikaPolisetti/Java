package java_Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSet_For_StuObj_Sort_n_Unique {

	public static void main(String[] args) {
		TreeSet<Student1> tset= new TreeSet<Student1>();
		tset.add(new Student1("Eena", 101));
		tset.add(new Student1("Abhi", 102));
		tset.add(new Student1("Abhi", 102));
		tset.add(new Student1("Ina", 103));
		tset.add(new Student1("Diya", 104));
		System.out.println("Treeset guarantees ascending order");
		System.out.println(tset);
		//Collections.sort((List<T>)tset,new TreeSet_For_StuObj_Sort_n_Unique());
		
		/*
		 * Works directly for primitive type
		 
		TreeSet l=new TreeSet();
		l.add(3);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(3);
		l.add(5);
		System.out.println(l);
		*/
	}

	

}

package java_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_For_StuObj {

	public static void main(String[] args) {
	
		HashSet<Student1> hset= new HashSet<Student1>();

		hset.add(new Student1("Abhi", 101));
		hset.add(new Student1("Bindu", 102));
		hset.add(new Student1("Bindu", 102));
		hset.add(new Student1("Cina", 103));
		hset.add(new Student1("Diya", 104));
		System.out.println(hset);

		
		
		
	}

}

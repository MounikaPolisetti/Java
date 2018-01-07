package java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Store_5_Stu_Objects_InArrayList {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(11,"Anu",22));
		al.add(new Student(12,"Bnu",21));
		al.add(new Student(13,"Cnu",22));
		al.add(new Student(14,"Dnu",21));
		al.add(new Student(15,"Enu",22));
		Iterator i=al.iterator();
		for(Student s: al)
		System.out.println(s.toString());

	}

}

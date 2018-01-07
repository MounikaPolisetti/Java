package java_Collections;

import java.util.Comparator;
import java.util.HashSet;

public class Student1 implements Comparable<Student1> {
	String name;
	int regNo;
	
	public Student1(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}
	
	@Override
	public String toString() {
		
		return this.name+ " "+this.regNo;
	}

	@Override
	public int hashCode() {
		return name.hashCode()*31+regNo*31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(this instanceof Student1){
			Student1 s1= (Student1) obj;
			return this.name==s1.name && this.regNo==s1.regNo;
		}
		return false;
	}
	
	

	@Override
	public int compareTo(Student1 obj) {
		Student1 s= (Student1)obj;
		return this.name.compareTo(s.name);
	}	
		
	

}

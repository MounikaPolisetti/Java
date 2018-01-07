package java_Collections;

public class Student {
	
		int id;
		String name;
		int age;
		
		Student(int id, String name, int age){
			this.id = id;
			this.name = name;
			this.age = age;
		}
	
		public String toString(){	
			return this.id+ " "+this.name+ " "+this.age;
		}
}

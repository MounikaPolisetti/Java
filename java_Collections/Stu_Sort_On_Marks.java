package java_Collections;

public class Stu_Sort_On_Marks implements Comparable {
	String name;
	String grade;
	int totalMarks;


	 Stu_Sort_On_Marks(String name, String grade, int totalMarks) {
		this.name = name;
		this.grade = grade;
		this.totalMarks = totalMarks;
	}
	 
	 @Override
	public String toString() {
		
		return this.name+ " "+ this.grade+ " "+ this.totalMarks;
	}

	@Override
	public int compareTo(Object obj) {
		Stu_Sort_On_Marks sm=(Stu_Sort_On_Marks) obj;
		return sm.totalMarks;
	}
	
}

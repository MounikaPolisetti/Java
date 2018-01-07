package java_Collections;

import java.util.TreeMap;

public class TreeMap_Stu_Library {
	

	public static void main(String[] args) {
		TreeMap<Library,Student5> tm= new TreeMap<Library,Student5>();
		tm.put(new Library(11,3), new Student5("Asha",3));
		tm.put(new Library(20,4), new Student5("Sasha",3));
		tm.put(new Library(13,3), new Student5("Trisha",3));
		tm.put(new Library(15,3), new Student5("Pasha",3));
		tm.put(new Library(14,3), new Student5("Chasha",3));
		tm.put(new Library(11,3), new Student5("Asha",3));
		tm.put(new Library(13,3), new Student5("Trisha",3));
		//System.out.println(tm);
		
		for(Library i : tm.keySet()){
			System.out.println("LibNum="+ i.libNum+ " TotalBooks" +i.totalBooks+" :: Student="+ tm.get(i).name+ " Semester:"+ tm.get(i).sem);
		}
	}

}

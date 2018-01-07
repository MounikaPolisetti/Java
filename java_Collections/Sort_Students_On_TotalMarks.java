package java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Sort_Students_On_TotalMarks {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet<Stu_Sort_On_Marks> hset=new HashSet<Stu_Sort_On_Marks>();
		hset.add(new Stu_Sort_On_Marks("Anu","B",450));
		hset.add(new Stu_Sort_On_Marks("Bnu","B+",470));
		hset.add(new Stu_Sort_On_Marks("Cnu","C",400));
		hset.add(new Stu_Sort_On_Marks("Dnu","B",455));
		hset.add(new Stu_Sort_On_Marks("Enu","A",490));
		System.out.println(hset);
		//Using Sorting method from Collection
		
		Collections.sort((List<Stu_Sort_On_Marks>) hset);
		
		System.out.println(hset);

	}

}

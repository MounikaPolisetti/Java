package java_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Store_N_Display {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(11, "Anu");
		hm.put(13, "Bnu");
		hm.put(15, "Cnu");
		hm.put(12, "Dnu");
		hm.put(11, "Anu");
		hm.put(15, "Cnu");
		hm.put(14, "Dnu");
		for(Integer i:hm.keySet()){
			System.out.println( " Key="+i+" Value="+ hm.get(i) );
		}
	}

}

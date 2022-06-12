package Generic;

import java.util.*;

public class Generic_Main {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Data");
//		arr.add(3);                    It would throw an error because we arranged the data type as String
		
		ArrayList<Integer> exmp = new ArrayList();
		exmp.add(5);
		exmp.add(4);
		exmp.add(3);
		exmp.add(2);
		
//		exmp.forEach(item -> System.out.println(item));
		
		for(Integer obj : exmp) {
			System.out.println(obj);
		}
		System.out.println("--------------");
		
		HashMap<Integer,String> hmap = new HashMap<>();
		
		hmap.put(5, "Semi");
		hmap.put(34, "Istanbul");
		hmap.put(88, "Toor");
		
		for(Integer key : hmap.keySet()) {
			System.out.println("Key = " + key + " Value = " + hmap.get(key));
		}
		System.out.println("--------------");
		
		for(String val : hmap.values()) {
			System.out.println(val);
		}
		
		
	}

}

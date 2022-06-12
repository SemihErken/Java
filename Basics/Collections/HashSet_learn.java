package Collections;

import java.util.*;

public class HashSet_learn {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("String 12");
		h.add(12);
		h.add(12.89);
		h.add(true);
		h.add(null);
		h.remove(12);
		
		System.out.println(h.contains(12) + "\n");
		
		/*
		Iterator iter = h.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		
		h.forEach(item -> System.out.println(item + " "));
		
	}
}
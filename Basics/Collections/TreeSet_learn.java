package Collections;

import java.util.*;

public class TreeSet_learn {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();  // NULL is not accepted
		
		tree.add("F");
		tree.add("D");
		tree.add("C");
		tree.add("A");
		
		
		try {
//			tree.forEach(iter -> System.out.println(iter + ","));
			tree.add(null);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		tree.forEach(iter -> System.out.println(iter + ","));
		
	}

}

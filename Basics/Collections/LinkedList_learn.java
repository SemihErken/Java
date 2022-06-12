package Collections;

import java.util.*;

public class LinkedList_learn {

	public static void main(String[] args) {
		
		LinkedList fruits = new LinkedList();
		
		fruits.add("Apple");
		fruits.add("Pear");
		fruits.add("Kiwi");
		fruits.add("Watermelon");
		
		fruits.add(0, "Melon");
		
		fruits.forEach(item -> System.out.println(item));
		
	}

}

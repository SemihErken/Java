package Collections;

import java.util.*;

public class Vector_learn {

	public static void main(String[] args) {
		
		Vector v = new Vector(4,2);   // (4) It sets it's default capacity as 4 , then it increments by 4's if you leave it blank it will be 10
									// (4,2) It sets it's default capacity as 4 , then it increments by 2's 
		v.add("Apple");
		v.add("Grape");
		v.add("Watermelpn");
		v.add("Melon");
		v.add("Pear");
//		v.add("Banana");
//		v.add("Cherry");
//		v.add("Kiwi");
//		v.add("Pistachio");
//		v.add("Almond");
//		v.add("Cashew");
//		v.add("Redbull");
		
		
		System.out.println("Size = " + v.size());
		System.out.println("Capacity = " + v.capacity());
	}

}

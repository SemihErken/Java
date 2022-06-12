package Collections;

import java.util.*;

public class ArrayList_learn {

	public static void main(String[] args) {
		
		ArrayList country = new ArrayList();
		ArrayList country1 = new ArrayList();

		
		country.add("San Francisco");
		country.add("Los Angeles");
		country.add("New York City");
		country.add("Miami");
		country.add("Orlando");
		country.add("Nashville");
		country.add("Indianapolis");
		country.add("New York City");
//		country.add(5);

		
		country.forEach(item -> System.out.println(item));
		System.out.println("--------------------");
		
		country1.add("San Francisco");
		country1.add("Los Angeles");
		country1.add("New York City");
		country1.add("Miami");
		country1.add("Orlando");
		country1.add("Nashville");
		country1.add("Indianapolis");
		country1.add("New York City");
		country1.add(3, "Atlanta");

		country1.forEach(item -> System.out.println(item));
		System.out.println("--------------------");
		country1.remove(3);
		country1.forEach(item -> System.out.println(item));
		System.out.println("--------------------");
		
		Iterator itr = country1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

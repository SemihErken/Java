package Collections;

import java.util.*;

public class LinkedHashSet_learn {

	public static void main(String[] args) {
		
		LinkedHashSet days = new LinkedHashSet();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		days.add("Monday");
		days.add(null);
		days.add(null);
		
		days.forEach(item -> System.out.println(item + ","));
	}

}

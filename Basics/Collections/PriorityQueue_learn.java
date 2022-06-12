package Collections;

import java.util.*;

public class PriorityQueue_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q = new PriorityQueue();
		
		q.add(40);
		q.add(20);
		q.add(10);
		q.add(30);
		q.add(80);
		
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		q.add(700);
		System.out.println("\n");
		q.forEach(item -> System.out.println(item));
	}

}

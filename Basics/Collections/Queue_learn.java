package Collections;

import java.util.*;

public class Queue_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new LinkedList();
		q.add("Deniz");
		q.add("Ali");
		q.offer("hakan");   //same as add , but it's got a try except catch block
		
		System.out.println("Remove : " + q.remove());
		System.out.println("Element : " + q.element());
		System.out.println("Peek : " + q.peek());    //  same as element , but it's got a try except catch block it could return null
		System.out.println("Poll : " + q.poll());   //  same as remove , but it's got a try except catch block it could return null
		
		
		q.forEach(item -> System.out.println(item));
	}

}

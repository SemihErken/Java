package Generic;

public class GenericMethod {
	
	public <E> void genericMethod(E[] arr) {
		
		for(E element : arr)
			System.out.println(element.toString());
	}
}

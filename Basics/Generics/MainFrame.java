package Generic;

public class MainFrame {

	public static void main(String[] args) {
		
		Test<Integer> test_int = new Test<Integer>(15);
		
		System.out.println(test_int.getObj());
		
		Test <String> test_str = new Test<String>("Hello World");
		
		System.out.println(test_str.getObj());
		System.out.println("---------------------");
		
		Test2<Integer, String> test2_mixed = new Test2(70,"K-Town");
		
//		test2_mixed.setObj1(88);
//		test2_mixed.setObj2("Toor");
		
		System.out.println(test2_mixed.getObj1() + " " + test2_mixed.getObj2());
		System.out.println("---------------------");
		
		GenericMethod gM = new GenericMethod();
		
		String[] arr_str = {"Semi","Erk","K-Town"};
		Integer[] arr_int = {1,3,5,7,9};
		Character[] arr_chr = {'C','O','D','E'};
		
		gM.genericMethod(arr_str);
		
		genericMethod(arr_str);
		genericMethod(arr_int);
		genericMethod(arr_chr);
		
	}	
	
	public static <E> void genericMethod(E[] arr) {
		
		for(E element : arr)
			System.out.println(element.toString());
	}

}

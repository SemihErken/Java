package Arrays;
import java.util.Scanner;

public class Arrays {	

	public static void main(String[] args) {

//   DataType ArrayName[] = new DataType[element number];

//   DataType[] ArrayName = new DataType[element number];
		
//   DataType[] ArrayName = {1,2,3,4};		

		
		int array[] = new int[5];
		
		
		for(int i = 0 ; i < array.length; ++i) {
			
			System.out.println("Please Enter the " + (i+1) + ". Number : 	");
			
			Scanner scan = new Scanner(System.in);
			
			array[i] = scan.nextInt();
		
		}
		
		for(int value : array) {
			System.out.print(value + " ");
		}
	}
	
}

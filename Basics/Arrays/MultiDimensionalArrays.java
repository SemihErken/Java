package Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int MultiArray[][] = new int[][]{
			{1,75,10,40},
			{2,70,15,80},
			{3,85,20,90}
		};
		
		for(int i = 0 ; i < MultiArray.length ; i++) {
			for(int j = 0 ; j < MultiArray[i].length ; j++) {	
				System.out.print(MultiArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for(int row[] : MultiArray) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}

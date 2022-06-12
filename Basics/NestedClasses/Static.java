package NestedClasses;

public class Static {
	
	private int a = 10;
	private static int b = 3;
	
	public static class Inner{
		int a = 1;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
//			System.out.println(Static.this.a);      Since our class is static , we do not form objects thats why we can't access to the master class
			System.out.println(b);
		}
	}
}

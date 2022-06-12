package NestedClasses;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStatic obj = new NonStatic();
		NonStatic.Inner inner = obj.new Inner();
//		obj.run();
		
		Static.Inner stat_inner = new Static.Inner();
		
//		stat_inner.run();
		
		Local l = new Local();
		
//		l.run();
	
		Anonym an = new Anonym() {
			public void run() {
				System.out.println("This Is Run Method From Anonym Class");
			}
		};
		
		an.run();
	}

}

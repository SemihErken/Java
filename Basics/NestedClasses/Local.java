package NestedClasses;

public class Local {
	
	public void run() {
		
		class local{
			
				int a;
			
				local(int a){
					this.a = a;
			}
			
				public void print() {
					System.out.println(a);
			}
		
		}
		
		local y = new local(12);
		
		y.print();
	}
}

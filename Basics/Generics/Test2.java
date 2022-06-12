package Generic;

public class Test2 <T , U>{
	
	T obj1 ;
	
	U obj2;
	
	Test2(T obj1 , U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	T getObj1() {
		return this.obj1;
	}
	
	U getObj2() {
		return this.obj2;
	}
	
	void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	
	void setObj2(U obj2) {
		this.obj2 = obj2;
	}

	
}

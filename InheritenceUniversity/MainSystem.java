package InheritenceUniversity;

public class MainSystem {

	public static void main(String[] args) {
	
	Employee emp1 = new Employee("Amele","a@gmail.com","31");	
		
	Lecturer lct1 = new Lecturer("Kemal","k@hotmail.com","100","Mechanics","Teach","Heat Process","Doctor");
	
	Officers ofc1 = new Officers("Affan","a@hgna.coom","1254","Electronics","9-5");
	
//	System.out.println(emp1.Enter());
//	System.out.println(acm1.Enter());
//	System.out.println(lct1.Enter());
//	Employee[] list = {emp1,acm1,lct1,ofc1};
//	Employee.printAll(list);
	
	lct1.AttendClass(10);
	
	}

}

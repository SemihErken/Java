package InheritenceUniversity;

public class Employee {
	
	String Name,Email,CellNumber;
	
	public Employee(String Name, String email, String cellNumber) {
		this.Name = Name;
		this.Email = email;
		this.CellNumber = cellNumber;
	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getCellNumber() {
		return CellNumber;
	}


	public void setCellNumber(String cellNumber) {
		CellNumber = cellNumber;
	}

	
	public String Enter() {
		return this.Name + " Employee Has Entered ! ";
	}
	
	public void Exit() {
		System.out.println("Employee Has Entered ! ");
	}
		
	public static void printAll(Employee[] lst) {
		for(Employee E : lst) {
			System.out.println(E.Enter());
		}
	}
}

package InheritenceUniversity;

public class Officers extends Employee{
	String Department, Shift;
	
	public Officers(String Name,String Email,String CellNumber,String Department , String Shift){
		super(Name,Email,CellNumber);
		this.Department = Department;
		this.Shift = Shift;
	}
	public String Enter() {
		return "Officer " + super.Name + " Has Entered ! "; 
	}
}

package InheritenceUniversity;

public class Security extends Officers{
	
	String Document;
	
	public Security(String name , String email, String cellNumber, String department,String shift,String document) {
		super(name,email,cellNumber,department,shift);
		this.Document = document;
	}
	
}

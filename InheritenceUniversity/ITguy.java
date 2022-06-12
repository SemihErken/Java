package InheritenceUniversity;

public class ITguy extends Officers{
	String Task;
	
	public ITguy(String name , String email , String cellNumber , String department ,String shift , String task) {
		super(name,email,cellNumber,department,shift);
		this.Task = task;
	}
}

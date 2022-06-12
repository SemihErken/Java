package InheritenceUniversity;

public abstract class Academician extends Employee {

	protected String Department,Assignments,Lectures;
			
	
	public Academician(String Name, String email, String cellNumber, String department, String assignments,
			String lectures) {
		super(Name, email, cellNumber);
		this.Department = department;
		this.Assignments = assignments;
		this.Lectures = lectures;
	}
	
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getAssignments() {
		return Assignments;
	}

	public void setAssignments(String assignments) {
		Assignments = assignments;
	}

	public String getLectures() {
		return Lectures;
	}

	public void setLectures(String lectures) {
		Lectures = lectures;
	}

	public abstract void AttendClass(int lectureHour);
	
	public String Enter() {
		return "Academician " + this.Name + " Has Entered ! ";
	}
}

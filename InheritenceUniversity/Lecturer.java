package InheritenceUniversity;

public class Lecturer extends Academician{

	String Degree;
	
	public Lecturer(String name,String email,String cellNumber,String department,String assignments, String lectures ,String degree) {
		super(name,email,cellNumber,department,assignments ,lectures);
		this.Degree = degree;
	}
	
	public String getDegree() {
		return this.Degree;
	}
	
	public String setDegree(String degree) {
		return this.Degree=degree;
	}
	/*
	public void Enter() {
		System.out.println("Lecturer " + this.Name +" Has Entered !");
	} */
	
	/*
	public void Enter(String gate) {
		System.out.println(this.Name + " Has Entered From Gate : " + gate);
	}
	*/
	
	public String Enter() {
		return "Lecturer " + super.Enter();
	}
	
	public void AttendClass(int lectureHour) {
		System.out.println(getDegree() + " "+ this.Name + " Has Entered " + getLectures() + " " +lectureHour +" Lesson");
		
	}
	

}

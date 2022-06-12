package InheritenceUniversity;

public class Assistant extends Academician{
	
	protected String MasterDegree;
	
	public Assistant(String Name,String Email,String cellNumber , String department ,String assignment,String lectures ,String MasterDegree) {
		super(Name, Email, cellNumber,department,assignment,lectures);
		this.MasterDegree = MasterDegree;
	}
	
	public void AttendClass(int lectureHour) {
		System.out.println("Assistant " + this.Name);
		
	}

	public String getMasterDegree() {
		return MasterDegree;
	}

	public void setMasterDegree(String masterDegree) {
		MasterDegree = masterDegree;
	}
	
	

}

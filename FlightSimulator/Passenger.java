package FlightSimulator;

public class Passenger extends Person{
	
	double luggageWeight; 
	
	Infant inf;
	
	public Passenger(String name , int ID , double luggageWeight) {
		super(name,ID);
		this.luggageWeight = luggageWeight;
	}


	public void setInfant(int ageInMonths) {
		inf = new Infant(ageInMonths);
	};
	
	
	public int getInfant() {
		if(inf == null)
			return -1;
		else
			return inf.getAgeInMonths();
	};
	
	
	class Infant{
		private int ageInMonths;

		public Infant(int ageInMonths) {
			this.ageInMonths = ageInMonths;
		}

		public int getAgeInMonths() {
			return ageInMonths;
		}

		public void setAgeInMonths(int ageInMonths) {
			this.ageInMonths = ageInMonths;
		}
		
		
	}

}

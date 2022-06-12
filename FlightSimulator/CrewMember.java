package FlightSimulator;

import java.util.Date;
	
		
public class CrewMember extends Person{
		
		 Date recruited ;
		private CrewType type;
		
		public CrewMember(String name , int ID , Date recruited , CrewType type) {
			super(name,ID);
			this.recruited = recruited;
			this.type = type;
		}
		
		public CrewType getType() {
			return this.type;
		}
		
		public boolean isSenior() {
			Date currentDate = new Date(System.currentTimeMillis());
			long longYears = currentDate.getTime() - recruited.getTime();
			int duration = (int)(longYears/10001*60*60*24*365);
			if(duration > FlightRules.yearsToBecomeSenior) {
				return false;
			}
			else
				return true;
		}
		
		
}

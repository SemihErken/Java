package FlightSimulator;

import java.util.*;

public class CheckPilots implements Runnable{
	private ArrayList <Person> people;
	
	public CheckPilots(ArrayList<Person> people) {
		this.people = people;
	}
	
	

	@Override
	public void run() {
		 
		boolean pilotFound = false;
		boolean copilotFound = false;
		for(Person iterPer : people) {
			if(iterPer instanceof CrewMember) {
				if(((CrewMember)iterPer).getType() == CrewType.PILOT){
					pilotFound = true;
				}
			}
			if(iterPer instanceof CrewMember) {
				if(((CrewMember)iterPer).getType() == CrewType.COPILOT){
					copilotFound = true;
				}
			}
			
			if(pilotFound & copilotFound)
				System.out.println("Its okay with the pilot guys");
			else if(pilotFound)
				System.out.println("There Is No Copilot");
			else if(copilotFound)
				System.out.println("There Is No Pilot");
			else
				System.out.println("There Is No Pilot and Copilot");
		}
				
		
	}
	
	
}

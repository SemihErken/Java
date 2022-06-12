package FlightSimulator;

import java.util.*;

public class CheckHostesses implements Runnable{

	ArrayList<Person> people; 
	
	public CheckHostesses(ArrayList people) {
		this.people = people;
	}
	
	@Override
	public void run() {
		
		int hostessCounter = 0;
		boolean hostessSenior = false; 

		for(Person iterPer : people) {
			if(iterPer instanceof CrewMember) {
				if(((CrewMember) iterPer).getType() == CrewType.HOSTESS) {
					if(((CrewMember) iterPer).isSenior() == true){
						hostessSenior = true;
					}
				hostessCounter++;
				}		
			}		
		}
		
		if(hostessSenior & hostessCounter > 1)
			System.out.println("No Problem");
		
	}

	
}

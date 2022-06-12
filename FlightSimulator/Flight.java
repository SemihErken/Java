package FlightSimulator;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Flight {
	
	ArrayList <Person> people;
	
	public Flight() {
		people = new ArrayList<Person>();
	}
	
	
	public void loadPeopleFromDisk() throws IOException, ClassNotFoundException {
		
		try {
		
		FileInputStream filein = new FileInputStream("data.ser");
		ObjectInputStream objIn = new ObjectInputStream(filein);
		boolean EOF = false;
		while(!EOF){
			 try{
			people.add((Person)objIn.readObject());
			}
			catch(EOFException e) {
				EOF = true;
			}
			 catch(Exception f) {
			System.out.println(f.getMessage());
			 } 
		}
		objIn.close();

	}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public synchronized void savePeopleToDisk(String FileName) {
		try {
			FileOutputStream fileout = new FileOutputStream(FileName);
			ObjectOutputStream objOut = new ObjectOutputStream(fileout);
			
			for(int i = 0 ; i < people.size(); i++) {
				objOut.writeObject(people.get(i));
			}
			
			objOut.close();
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void checkCrew() throws InterruptedException{
		Runnable r1 = new CheckPilots(people);
		Thread t1 = new Thread(r1);
		Runnable r2 = new CheckHostesses(people);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	
	public void addPeople(Person newGuy) throws Exception{
		for(Person p : people) {
			if(p.ID == newGuy.ID)
				throw new FlightException("This Guy Exists");
		}
		people.add(newGuy);
	}
}

package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		User userReaded = new User();
		
		/*
		User user = new User();
		user.userName = "semi";
		user.password = "pass";
		
		
		
		
		FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream (fileout);
		out.writeObject(user);
		out.close();
		fileout.close();
		
		System.out.println("Successful File Operation ! "); */
		
		FileInputStream filein = new FileInputStream("UserInfo.ser");
		ObjectInputStream reader = new ObjectInputStream(filein);
		userReaded = (User) reader.readObject();
		
//		System.out.println("Successful File Read Operation ! ");
		
		System.out.println(userReaded.userName + " " + userReaded.password);

	}

}

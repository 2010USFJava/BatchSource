package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Person;

public class IOWithCollections {
	//setting up the name of the file for both method
	private static final String personFile="person.txt";
	public static List<Person> personList= new ArrayList<Person>();
	//write ArrayList to file
	public static void writePersonFile() {
		try {
			ObjectOutputStream objectOut =new ObjectOutputStream(new FileOutputStream(personFile));
			objectOut.writeObject(personList);
			objectOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Read info into an ArrayList
	@SuppressWarnings("unchecked")
	public static void readPersonFile() {
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(personFile));
			personList=(ArrayList<Person>)objectIn.readObject();
			objectIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

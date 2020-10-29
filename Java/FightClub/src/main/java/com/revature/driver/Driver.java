package com.revature.driver;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {
	static {FileStuff.readWarriorFile();}
	public static void main(String[] args) {
		//FileStuff.readWarriorFile();
		Warrior mikey= new Warrior("Jimbo",200,4);
		Warrior steven = new Warrior("Sir Cranston", 150,8);
		System.out.println(Roster.warriorList.toString());
		

	}

}

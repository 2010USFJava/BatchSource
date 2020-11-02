package com.revature.driver;

import com.revature.beans.Warrior;
import com.revature.menu.Menu;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {
	static {FileStuff.readWarriorFile();}
	public static void main(String[] args) {
		Menu.startMenu();
		

	}

}

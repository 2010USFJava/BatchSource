package com.revature.service;

import com.revature.beans.Warrior;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Fight {
	public void fightTime(Warrior a, Warrior b) {
		//a is going to hit b
		int firstAttackPower= a.getAttackPower();
		int secondHP = b.getHp();
		
		b.setHp(secondHP-firstAttackPower);
		FileStuff.writeWarriorFile(Roster.warriorList);
	}
}

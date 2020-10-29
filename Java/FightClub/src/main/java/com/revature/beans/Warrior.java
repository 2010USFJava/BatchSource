package com.revature.beans;

import java.io.Serializable;

import com.revature.util.FileStuff;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Warrior implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7164094851019158192L;
	private String name;
	private int hp;
	private int attackPower;
	public Warrior() {
		super();
		Roster.warriorList.add(this);
		FileStuff.writeWarriorFile(Roster.warriorList);
	}
	public Warrior(String name, int hp, int attackPower) {
		super();
		this.name = name;
		this.hp = hp;
		this.attackPower = attackPower;
		Roster.warriorList.add(this);
		FileStuff.writeWarriorFile(Roster.warriorList);
		LogThis.LogIt("info", "A new warrior, "+ this.name + ", has entered the arena!");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	@Override
	public String toString() {
		return "Warrior [name=" + name + ", hp=" + hp + ", attackPower=" + attackPower + "]";
	}
	
	
}

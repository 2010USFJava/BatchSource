package com.revature.services;

import com.revature.beans.GameCharacter;

public class Battle {
	public enum attackType{
		BASIC,
		POWER
	}
	
	public static void attackPhase(GameCharacter a,GameCharacter b,attackType aType) {
		int bHP = b.getHp();
		int aAP;
		if(aType.equals(attackType.BASIC)) {
			aAP = a.getSkillset().basicAttack();
		}else if(aType.equals(attackType.POWER)){
			aAP = a.getSkillset().powerAttack();
		}else {
			System.out.println("How did you mess this up?");
			aAP = 0;
		}
		bHP = bHP - aAP;
		b.setHp(bHP);
		System.out.println("b's HP is now " + bHP);
	}
}

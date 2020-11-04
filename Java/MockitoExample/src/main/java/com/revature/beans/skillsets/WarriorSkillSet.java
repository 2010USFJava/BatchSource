package com.revature.beans.skillsets;

import com.revature.beans.SkillSet;

public class WarriorSkillSet implements SkillSet {

	public int basicAttack() {
		//massive amounts of logic
		return 5;
	}

	public int powerAttack() {
		int basic=basicAttack();
		int power=(basic*4)/2;
		return power;
	}

}

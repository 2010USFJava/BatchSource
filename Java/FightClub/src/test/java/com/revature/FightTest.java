package com.revature;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
@ExtendWith(MockitoExtension.class)
class FightTest {
	
	  @Mock	static ArrayList<Warrior> mockRoster;
	  
	  @BeforeAll static void loadMockRoster() {
	  System.out.println("loading mockRoster"); 
	  Warrior a= new Warrior("Test A",100,5);
	  Warrior b= new Warrior("Test B", 100,5);
	  mockRoster.add(a);
	  mockRoster.add(b);
	  Mockito.verify(mockRoster).add(a);
	  Mockito.verify(mockRoster).add(b);
	  System.out.println(mockRoster.toString()); 
	  }
	 
	@Test
	void testFight() {

		System.out.println("in testFight");
		Fight fight= new Fight();
		fight.fightTime(mockRoster.get(0), mockRoster.get(1));
		int expected=95;
		int actual= mockRoster.get(1).getHp();
		System.out.println("actual is "+actual);
		//expected , actual
		assertEquals(expected,actual);
	}

}

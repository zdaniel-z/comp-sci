/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter daniel = new myCharacter();
		daniel.setRole("Wizard");
		daniel.setStrength(4);
		daniel.setDexterity(6);
		daniel.setIntelligence(1);
		daniel.setCharisma(4);
		daniel.myToString();
		
		myCharacter dan = new myCharacter("Warrior");
		dan.myToString();
		


		
	}
}

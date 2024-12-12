/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Wizard");
	int s = 4;
	int d = 5;
	int i = 8;
	int c = 3;
}

class starter {
	public static void main(String args[]) {
		Character wizard = new Character();
		System.out.println("Your role: "+wizard.role);
		System.out.println("Your strength: "+wizard.s);
		System.out.println("Your durability: "+wizard.d);
		System.out.println("Your intellegence: "+wizard.i);
		System.out.println("Your charisma: "+wizard.c);
		



		
	}
}

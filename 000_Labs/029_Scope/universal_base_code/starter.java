/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int i;
		String statement = "";
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			statement = new String(shrek.name + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact();
		for(i = 0; i < 5; i++){
			name=donkey.getName();
			shrek.interact();
		}
		System.out.println("That printed out " + i + " times");

	}
}

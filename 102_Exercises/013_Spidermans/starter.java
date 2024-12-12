/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman();
		x.setActor("TobeyMaguire");
		x.setAge(49);
		x.setVillian("Green Goblin");
		
		
		Spiderman y = new Spiderman("Andwer Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Halland");
		z.setAge(28);
		z.setVilian("The Vulture");
		
		Spiderman g = new Spiderman(9);
		g.setActor("daniel");
		g.setVillia("another daniel");
		
		
		System.out.println("the villian is"+ y.getVillian());
		
		
		
		
		

		
	}
}

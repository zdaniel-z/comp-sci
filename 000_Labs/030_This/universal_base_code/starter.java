/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		
		int counter = 0;
		
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf jett = new PooleDwarf("Jett", 14);
		String name = jett.getName();
		
		PooleDwarf harbor = new PooleDwarf("Harbor", 34);
		
		PooleDwarf clove = new PooleDwarf("Clove", 9);
		
		PooleDwarf phoenix = new PooleDwarf("Jett", 19);
		
		PooleDwarf cypher = new PooleDwarf("Cypher", 23);
		
		PooleDwarf neon = new PooleDwarf("Jett", 45);
		
		PooleDwarf reyna = new PooleDwarf("Reyna", 5);
		
		if(jett.isSameName(harbor.getName())){
			counter++;
		}
		if(jett.isSameName(clove.getName())){
			counter++;
		}
		if(jett.isSameName(phoenix.getName())){
			counter++;
		}
		if(jett.isSameName(cypher.getName())){
			counter++;
		}
		
		if(jett.isSameName(neon.getName())){
			counter++;
		}
		
		if(jett.isSameName(reyna.getName())){
			counter++;
		}
		
		System.out.println("the num of duplicates: "+ counter);
		System.out.println(name);
	}
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		//creating arrays
		Wizard [] arrWiz = new Wizard[100];
		Warrior [] arrWar = new Warrior[100];
		int counter=100;
		int counter2=100;
		
		
		for(int i=0;i<arrWiz.length;i++){
			arrWiz[i]= new Wizard();
		}
		
		for(int i=0;i<arrWar.length;i++){
			arrWar[i]= new Warrior();
		}
		
		for(int i=0;i<arrWiz.length;i++){
			arrWiz[i].attack(arrWar[i]);
			if(arrWar[i].isDead()){
				counter--;
			}
			arrWar[i].attack(arrWiz[i]);
			if(arrWiz[i].isDead()){
				counter2--;
			}
		}
		if(counter2>counter){
			System.out.print("Warriors won with "+(counter2-counter)+" left");
		}
		else{
			System.out.print("Wizards won with "+(counter-counter2)+" left");
		}
		
		
	}
}

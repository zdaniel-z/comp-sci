/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Dog DrPepper = new Dog("DrPepper", 4);
	Dog Cooker = new Dog("Cooker", "Blue Cap Dog");
	
	if(DrPepper.isSleeping()==true){
		System.out.println("DrPepper is sleeping");
	}
	else{
		DrPepper.bark();
		if(Cooker.isSleeping()==true){
				Cooker.bark();
		}
		else{
			Cooker.bark();
		}
	}
	
	



	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wizard, warrior or a rogue?");
		String a = sc.nextLine();
		if(a.equals("wizard") || a.equals("Wizard")){
			System.out.print("You are a wizard");
		}
		else if(a.equals("rogue") || a.equals("Rogue")){
			System.out.print("You are a rogue");
		}
		else if(a.equals("warrior") || a.equals("warrior")){
			System.out.print("You are a warrior");
		}
		else{
			System.out.print("Wrong!!");
		}
		
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("What's the title?(Ex: Demon Slayer)");
		String title = sc.nextLine();
		
		System.out.println("Do you want to be a Wizard, warrior or a rogue?");
		String a = sc.nextLine();
		if(a.equals("wizard") || a.equals("Wizard")){
			System.out.println("You are a wizard. Yay!");
		}
		else if(a.equals("rogue") || a.equals("Rogue")){
			System.out.println("You are a rogue, Yay!");
		}
		else if(a.equals("warrior") || a.equals("warrior")){
			System.out.println("You are a warrior. Yay!");
		}
		else{
			System.out.print("Wrong!!");
		}
		int points = 20;
		System.out.println("Now you have 20 points to spend on Strength, Dexterity, Intelligence, Charisma.(10 points max for each one)");
		System.out.println("Strenght?(1-10): ");
		int s;
		s = sc.nextInt();
		if(s > 10){
			System.out.println("The max number is 10!");
			System.out.println("Stenght?(1-10): ");
			s = sc.nextInt();
			points = points - s;
			System.out.println(points + " points left");
		}
		else if(s <= 10){
			points = points - s;
			System.out.println("You have "+ points + " points left to spend");
		}
		
		
		System.out.println("dexterity(1-10): ");
		int d;
		d = sc.nextInt();
		if(d > 10){
			System.out.println("The max number is 10!");
			System.out.println("Dexterity?(1-10): ");
			d = sc.nextInt();
			points = points - d;
			System.out.println(points + " points left");
		}
		else if(d <= 10 && d <= points){
			points = points - d;
			System.out.println("You have "+ points + " points left to spend");
		}
		
		
		System.out.print("Intellegence(1-10): ");
		int i;
		i = sc.nextInt();
		if(i > 10){
			System.out.println("The max number is 10!");
			System.out.println("Intelligence?(1-10): ");
			i = sc.nextInt();
			points = points-i;
			System.out.print(points + " points left");
			}
		else if(i <= 10 && i <= points && (points-i >= 0)){
			points = points - i;
			System.out.println("You have "+ points + " points left");
		}
		
		
		
		System.out.print("Charisma(1-10): ");
		int c;
		c = sc.nextInt();
		if(c > 10){
			System.out.println("The max number is 10!");
			System.out.println("Charisma?(1-10): ");
			c = sc.nextInt();
			points = points-c;
			System.out.print(points+ " points left");
		}
		else if(i <= 10 && i <= points && (points-i >= 0)){
			points = points - i;
			System.out.println("You have "+ points + " points left");
		}
		
		System.out.println("Good luck, "+name+" on your "+ title+" journey!");
		System.out.println("strength: "+ s);
		System.out.println("dexterity: "+ d);
		System.out.println("intelligence: "+ i);
		System.out.println("charisma: "+ c);
	}
}
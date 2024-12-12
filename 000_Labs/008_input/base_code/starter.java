/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First name: ");
		String FirstName = sc.nextLine();
		System.out.println("Your name is "+ FirstName);
		
		System.out.print("age: ");
		int age = sc.nextInt();
		System.out.println("your age is "+ age);
		
		System.out.print("bday month: ");
		int bm = sc.nextInt();
		System.out.println("your bday month is "+ bm);
		
		System.out.print("bday day: ");
		int bd = sc.nextInt();
		System.out.println("your bday day is "+ bd);
		
		System.out.print("bday year: ");
		int by = sc.nextInt();
		System.out.println("your bday year is "+ by);
		
		System.out.print("How much is a buck fifty?: ");
		double bf = sc.nextDouble();
		System.out.print("there is "+ bf + " in a buck fifty");
	}
}

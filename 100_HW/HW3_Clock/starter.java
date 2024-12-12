/*
 *	Author: Daniel Z.
 *  Date: Sep 16
 *	Collaborator(s): -
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it?(0-6): ");
		int a = sc.nextInt();
		if(a == 0 || a == 6){
			System.out.print("Wake up at 10 am! It's weekend!");
		}
		else if(a < 0 || a > 6){
			System.out.print("invalid!");
		}
		else{
			System.out.print("Wake up at 7 am! It's a week day!");
		}
	}
}

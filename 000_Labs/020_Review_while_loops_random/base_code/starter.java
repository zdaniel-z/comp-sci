/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = (int) (Math.random()*1001);

		System.out.println("Guess the number");
		int g = sc.nextInt();
		while(true){
			if(a == g){
				System.out.println("You guessed the number!");
				break;
			}
			else{
				System.out.println("You didnt guess it right");
				g = sc.nextInt();
			}
		}



		
	}
}

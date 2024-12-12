/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int num = ((int) (Math.random() * 999)+1);
	System.out.println("Guess the num between 1 and 1000");
	int g = sc.nextInt();
	if(g == num){
		System.out.print("You guessed it right!");
	}
	else{
		System.out.print("Wrong! the right number is "+ num);
	}
	}
}

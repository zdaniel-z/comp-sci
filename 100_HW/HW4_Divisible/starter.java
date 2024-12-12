/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Input 2 variable");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a % 2 == 0){
			System.out.println("first number is even");
		}
		else{
			System.out.println("first number is odd");
		}
		if(b % 2 == 0){
			System.out.println("second number is even");
		}
		else{
			System.out.println("second number is odd");
		}
		if(a % 4 == 0){
			if(a % 5 == 0){
				if(a % 3== 0){
					System.out.println("first number is divisible by 3, 4, and 5");
				}
			}
		}
		else{
			System.out.println("first number is not divisible by 3, 4 and 5");
		}
		
		
		if(b % 4 == 0){
			if(b % 5 == 0){
				if(b % 3== 0){
					System.out.println("second number is divisible by 3, 4, and 5");
				}
			}
		}
		else{
			System.out.println("second number is not divisible by 3, 4 and 5");
		}
	}
}

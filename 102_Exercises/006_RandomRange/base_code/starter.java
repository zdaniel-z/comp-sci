/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("5 random numbers in this range:");
		System.out.print(((int) (Math.random()*b)+ a) + ", ");
		System.out.print(((int) (Math.random()*b)+ a) + ", ");
		System.out.print(((int) (Math.random()*b)+ a) + ", ");
		System.out.print(((int) (Math.random()*b)+ a) + ", ");
		System.out.print((int) (Math.random()*b)+ a);
	}
}

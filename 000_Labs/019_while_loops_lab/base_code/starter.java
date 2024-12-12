/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("name: ");
		String name;
		name = sc.nextLine();
		System.out.print("number of times to output: ");
		int num;
		num = sc.nextInt();
		int a = 0;
		while(a<num){
			System.out.println(name);
			a = a+1;
		}
		
	}
}

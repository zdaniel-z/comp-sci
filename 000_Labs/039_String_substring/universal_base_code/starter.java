/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		a = sc.nextLine();
		for(int i=0;i<a.length();i++){
			System.out.println(a.substring(i, (i+1)));
		}


		
	}
}

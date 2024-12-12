/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String a = sc.nextLine();
		System.out.print("last name:"+a.substring(a.indexOf(" "), a.length()));
		


		
	}
}

/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int key = 1;
		System.out.print("code: ");
		String a = sc.nextLine();
		while(key<36){
			System.out.println(key+":");
			System.out.println(Cipher.keyedEncode(a, key)+" ");
			key++;
			
		}
		

	}
}

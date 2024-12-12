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
		System.out.println("enter a sentence:");
		String sentence = sc.nextLine();
		String origSent = sentence;
		
		String result="";
		String orig="";
		
		
		System.out.println("\noriginal: ");
		System.out.println(origSent);
		System.out.println("\nnew:");
		System.out.println(rev(sentence));
		
	}
	
	public static String rev(String sentence){
		String result="";
		
		while(true){
			if(sentence.indexOf(" ")==-1){
				System.out.print(sentence);
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0,space);
			result = " "+word+result;
			sentence=sentence.substring(space+1);
		}
		return result;
	}
}

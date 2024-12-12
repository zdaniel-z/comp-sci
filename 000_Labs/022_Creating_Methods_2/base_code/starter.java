/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int num = 1;
		while(b>0){
			num=num*a;
			b=b-1;
		}
		System.out.print(num);
		return num;
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		pow(2,3);
		
	}
}

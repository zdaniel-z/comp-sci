/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int [] arr = new int[1000];
	int a = (int)(Math.random()*10)+1;
	for(int i=0; i<1000; i++){
		arr[i]=a;
		a=(int)(Math.random()*10)+1;
	}
	for(int b=0; b<1000; b++){
		System.out.println(arr[b]);
	}


		
	}
}

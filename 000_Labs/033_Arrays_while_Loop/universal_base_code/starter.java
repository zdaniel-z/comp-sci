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
	int i = 0;
	int b = 0;
	int a = (int)(Math.random()*10)+1;
	while(i<1000){
		arr[i]=a;
		i++;
		a=(int)(Math.random()*10)+1;
	}
	while(b<1000){
		System.out.println(arr[b]);
		b++;
	}


		
	}
}

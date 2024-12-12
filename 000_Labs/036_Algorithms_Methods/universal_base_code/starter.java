/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	
	
	
	public static void toStringArray(int[] a){
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		
		}
}

	public static int getArrayAverage(int[] b){
		int counter = 0;
		for(int i=0;i<b.length;i++){
			counter=counter+b[i];
	}
	return (counter/b.length);
	
}

	public static int getArrayMax(int[] c){
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		int [] arr = new int[100];
		int r1 = (int)(Math.random()*100)+1;
		for(int i = 0; i<100;i++){
			arr[i] = r1;
			r1 = (int)(Math.random()*100)+1;
		}
		
		
		
		
		
	}
}


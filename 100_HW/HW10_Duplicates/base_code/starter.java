/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int r1 = (int)(Math.random()*10)+1;
		int [] arr = new int[20];
		int rn = (int)(Math.random()*10)+1;
		int counter = 0;
		
		
	
		for(int i=0; i<arr.length; i++){
		arr[i] = r1;
		r1 = (int)(Math.random()*10)+1;
		}
	
		for(int i2=0; i2<arr.length; i2++){
			if(arr[i2]==rn){
				counter++;
				System.out.println("index: "+i2);
			}
		}
		System.out.println("num of duplicates: "+counter);
		System.out.println(" ");
		System.out.println(" ");
	
	
		for(int ii=0;ii<19;ii++){
			if(arr[ii]==arr[ii+1]){
				System.out.println("indexes: "+ (ii+1)+", "+(ii+2));
				System.out.println("number: "+arr[ii]);
				System.out.println(" ");
			}
		}
	
	}
}


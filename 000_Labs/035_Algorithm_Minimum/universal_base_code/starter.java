/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int r1 = (int)(Math.random()*149)+51;
	int r2 = (int)(Math.random()*100)+1;
	int [] arr = new int[r1];
	for(int i=0; i<r1; i++){
		arr[i] = r2;
		r2 = (int)(Math.random()*100)+1;
	}
	
	int min = arr[0];
	int max = arr[0];
	int aver = 0;
	
	
//min
	for(int i2=0; i2<r1; i2++){
		if(arr[i2]<min){
			min=arr[i2];
		}
}

//max
	for(int i3=0;i3<r1;i3++){
		if(arr[i3]>max){
			max=arr[i3];
		}
	}

//average
	for(int ii=0;ii<r1;ii++){
		aver = aver+arr[ii];
	}
	aver=aver/r1;
	
	System.out.println("the size of an array: "+r1);
	System.out.println("min: "+min);
	System.out.println("max: "+max);
	System.out.println("average: "+aver);
}
	
}

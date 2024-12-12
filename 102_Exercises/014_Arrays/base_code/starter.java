/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a = 3;
		int [] arr = new int[1001];
		int i = 1001;
		while(i>0){
			i--;
			arr[i]=a;
			a=a+3;
			System.out.println(arr[i]);
		}
		
		 
	
	
	int [] arr1 = new int[1001];
	int i1 = 1001;
	int b = 0;
		while(i1>0){
		i1--;
		arr1[b]=i1;
		System.out.println(arr1[b]);
	}

}
}
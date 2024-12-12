/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("the biggest is "+a);
			}
		}
		if(b>a){
			if(b>c){
				System.out.println("the biggest is "+b);
			}
		}
		if(c>a){
			if(c>b){
				System.out.println("the biggest is "+c);
			}
		}
		
		if(a<b){
			if(a<c){
				System.out.println("the smallest is "+a);
			}
		}
		if(b<a){
			if(b<c){
				System.out.println("the smallest is "+b);
			}
		}
		if(c<a){
			if(c<b){
				System.out.println("the smallest is "+c);
			}
		}
	}
}

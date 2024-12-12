/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int num){
		int a = num-1;
		while(a>1){
			if(num%a==0){
				return false;
			}
			a=a-1;
		}
		return true;
		}
	
	
	public static void printPrimes(int b){
			int a = 2;
			while(b>a){
				if(checkPrime(a)==true){
					System.out.println(a);
				}
				a++;
			}
		}
	
		
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num: ");
		int t = sc.nextInt();
		printPrimes(t);
	}


}
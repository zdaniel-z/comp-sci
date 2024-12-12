/*
 *	Author:  
 *  Date: 
*/


import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.max(13-6*11, 30%7*(-2)));
		System.out.println(Math.sqrt(3*8+31%7));
		System.out.println(Math.pow(37/3, 35%21));
		System.out.println(Math.max(Math.pow(2, 14%3), Math.sqrt(2*6)));
		
		System.out.println("extra part: ");
		System.out.println("first num: ");
		double a = sc.nextDouble();
		System.out.print("second num: ");
		double b = sc.nextDouble();
		System.out.println("Max is: "+Math.max(a, b));
		System.out.println("square root of b is: "+Math.sqrt(b));
		System.out.println("a in power b is: "+Math.pow(a, b));
	}
}

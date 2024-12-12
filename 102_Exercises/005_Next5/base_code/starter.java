/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter an int: ");
	int a = sc.nextInt();
	System.out.print((a) + ", ");
	System.out.print((a+1) + ", ");
	System.out.print((a+2) + ", ");
	System.out.print((a+3) + ", ");
	System.out.print((a+4) + ", ");
	System.out.println(a+5);
	
	System.out.println("second part");
	System.out.print((a*2)+ ", ");
	System.out.print((a*3)+ ", ");
	System.out.print((a*4)+ ", ");
	System.out.print((a*5)+ ", ");
	System.out.println(a*6);
	
	System.out.println("third part");
	System.out.println(a/100.0);
	System.out.print(a/10.0);
	

	}
}

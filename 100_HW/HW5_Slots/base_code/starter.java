/*
 *	Author: Daniel Z.
 *  Date: 10/1/24
 * 	Collaborator(s): no
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 1000;
			System.out.println("You have "+money+" dollars! Do you want to play?");
			System.out.println("Do you want to play?(y|Y|Yes|yes)");
			while(money>0){
			int a = (int) (Math.random()* 9);
			int b = (int) (Math.random()* 9);
			int c = (int) (Math.random()* 9);
			String answer = sc.nextLine();
			if(answer.equals("y") || answer.equals("yes") ||answer.equals("Y") || answer.equals("Yes")){
				System.out.println("you have "+money+" dollars");
				System.out.println("How much money do you want to bet?");
				int inp = sc.nextInt();
				if(inp<=money && inp>=1){
					System.out.println("| "+a+" | "+b+" | "+c+" |");
					if((a==b && a!=c)||(a==c && a!=b)||(b==a && b!=c)||(b==c && b!=a)||(c==a && c!=b)||(c==b && c !=a)){
						System.out.println("DOUBLE MONEY!");
						money = money+inp;
						System.out.println(money);
						System.out.println("DO you want to keep playing?");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("yes") ||answer.equals("Y") || answer.equals("Yes")){
							System.out.print("You have "+money+" dollars");
						}
					}
					else if(a==b && b==c){
						System.out.println("TRIPLE MONEY!");
						money = money+(inp*2);
						System.out.println("you have "+money+ "dollars!!");
						System.out.println("DO you want to keep playing?");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("yes") ||answer.equals("Y") || answer.equals("Yes")){
							System.out.print("You have "+money+" dollars");
						}
						}
					else{
						System.out.println("unlucky! you lost it");
						money = money-inp;
						System.out.println("you have "+ money+" dollars");
						if(money==0){
							break;
						}
						System.out.println("Do you want to keep playing?");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("yes") ||answer.equals("Y") || answer.equals("Yes")){
							System.out.print("You have "+money+" dollars");
						}
						}
						}
						else{
							System.out.print("no funds!");
							break;
						}
			}
			else{
				System.out.print("Final score: "+money+" dollars");
				break;
			}
						
				}
				}
			}
		 
		

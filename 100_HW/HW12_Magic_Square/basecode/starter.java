import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a num: ");
		int n = sc.nextInt();
		MagicSquare(n);
		
	}
	
	public static void MagicSquare(int n){
		int total=0;
		int a=1;
		while(total<n){
			int b=a*a;
			int count=0;
			
			for(int i=1;count<b;i++){
				count=count+i;
				if(count==b){
					System.out.println(b);
					total++;
				}
			}
			a++;
			}
	}
}

	
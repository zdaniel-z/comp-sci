/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("hello, "+name);
        System.out.println("first num:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("second num:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("the sum of these numbers is: "+(num1+num2));
        System.out.println("What is your favorite food?: ");
        String food = sc.nextLine();
        System.out.println("fav food is: "+food);
	}
}
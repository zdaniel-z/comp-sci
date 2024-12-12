/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have joined an Akuen Exchange");
        System.out.println("Pick an Alien to take in");
        System.out.println("1. Joe, a fat bellied alien who loves eating");
        System.out.println("2. Bob, a blue alien who loves trees");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies");
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You picked Joe!");
            System.out.println("let's choose some food for him(1 or 2)");
            int food = sc.nextInt();
            if(food == 1){
                System.out.println("Pizza!");
            }
            else if(food == 2){
                System.out.println("Donuts!");
            }
        }
        else if(answer1 == 2){
            System.out.println("You picked Bob!");
            System.out.println("Let's choose a tree for him(1 or 2)");
            int tree = sc.nextInt();
            if(tree == 1){
                System.out.println("Cherry tree! yay");
            }
            else if(tree == 2){
                System.out.println("Baobab tree yay!");
            }
        }
        else if(answer1 == 3){
            System.out.println("You picked Barney!");
            System.out.println("Should we cut his tail? 1 or 2(gamble)");
            int tail = sc.nextInt();
            if(tail == 1){
                System.out.println("you didnt cut his tail!");
            }
            else if(tail == 2){
                System.out.println("You cut his tail!");
            }
        }
        else{
            System.out.println("You get Jerry.");
            System.out.println("Jerry loves sleeping, lets choose a bed for him");
            
        }
	}
}
package revature;
import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] arg){
        //create scanner to grab user's age
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your age: ");
        int userAge = input.nextInt();

        //conditionals to customize response based on age
        if(userAge < 0 || userAge > 125) {
            System.out.println("Invalid age");
            System.out.println("Age must be between 0-125");
        }
        else if(userAge < 18) {
            System.out.println("You are just a kid.");
        }
        else if(userAge < 21) {
            System.out.println("You are not old enough to drink");
        }
        else {
            System.out.println("Congratulations!");
            System.out.println("You can go on the cruise!");
        }

        //ternary operator is a simpler form of if statement
        int myNum = 3 > 2 ? 10:5; //myNum is set to 10
    }
}

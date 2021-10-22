package revature;
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args){
        //create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        //ask user for integer using nextInt() method
        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        //ask user for a double using nextDouble() method
        System.out.print("Enter a double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);

        //ask user for string using nextLine() method
        System.out.println("Enter a string: ");
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\". %n%n", myString);
    }
}

package revature;
import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice {
    public static void main (String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        String userGrade = input.nextLine().toUpperCase();
        switch (userGrade) {
            case "A+":
            case "A":
                System.out.println("A Grade");
                System.out.println("Excellence");
                break;
            case "B":
                System.out.println("B Grade");
                break;
            case "C":
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Fail");
                break;
        }

    }
}

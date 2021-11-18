package revature;
import java.util.Scanner;

public class ErrorPractice {
    public static void main (String[] args) {
        int num, deno;

        //get values for division from user
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            num = input.nextInt();

            System.out.print("Enter the denominator: ");
            deno = input.nextInt();

            System.out.println("The result is " + num/deno);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("---End of Error Handling");
        }
    }
}

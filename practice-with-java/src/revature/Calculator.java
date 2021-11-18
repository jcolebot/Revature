package revature;

import com.sun.jdi.InvalidTypeException;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int num1;
    static int num2;


    public static void main(String[] args) {



        System.out.println("Make a selection: + - * /");
        var input = scanner.next();

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        if (input.equals("+")) {
            addNum();
        }
        else if (input.equals("-")) {
            subNum();
        }
        else if (input.equals("*")) {
            multiNum();
        }
        else if (input.equals("/")) {
            divNum();
        }
        else {
            try {
                System.out.println("Something went wrong.");
            }
            catch (Exception e) {
                System.out.println("You broke my calculator.");
            }
        }
    }

    private static void addNum() {
        int result = num1 + num2;
        System.out.println(num1 + num2);
    }

    private static void subNum() {
        int result = num1 - num2;
        System.out.println(result);
    }

    private static void multiNum() {
        int result = num1 * num2;
        System.out.println(result);
    }

    private static void divNum() {
        int result = num1 / num2;
        System.out.println(result);
    }
}

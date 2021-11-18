package revature;
import java.util.ArrayList;

// Lambda expression is a short block of code that takes parameters and returns a value
// Similar to methods, but do not need named and can be used in the body of a method
// Syntax examples:
// parameter -> expression
// (parameter1, parameter2) -> expression
// (parameter1, parameter2) -> {block of code}

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);
        numbers.forEach((n) -> {System.out.println(n);});
    }
}

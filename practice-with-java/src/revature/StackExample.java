package revature;
import java.util.Stack;

// challenge: create stack class with push and pop methods without using built-in collection

public class StackExample {
    Stack<Integer> stack = new Stack<Integer>();
    // adds 10 to the stack
    static void stackPush (Stack<Integer> stack) {
        for(int i = 0; i <= 10; i++) {
            stack.push(i);
        }
    }
    // subtracts 6 from the stack
    static void stackPop(Stack<Integer> stack) {
        for(int i = 0; i < 6; i++) {
            Integer myInt = (Integer) stack.pop();
            System.out.println(myInt);
        }
    }
    public static void main(String[] args) {
        // sets up an empty stack
        Stack<Integer> stack = new Stack<Integer>();

        // calling functions from above
        stackPush(stack);
        stackPop(stack);
    }
}

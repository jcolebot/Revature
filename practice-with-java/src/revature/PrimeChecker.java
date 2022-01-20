package revature;

// A prime number is a number that is divisible by only two numbers: 1 and itself.
// So, if any number is divisible by any other number, it is not a prime number.

public class PrimeChecker {

    public static void main(String[] args) {

        boolean checker = false;
        int num = 9; // number to be checked

        for (int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                checker = true;
                break;
            }
            if(checker != true) {
                System.out.println(num + " is prime");
            }
            else {
                System.out.println(num + " is not prime");
            }
        }
    }
}

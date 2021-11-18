package revature;
import java.util.Scanner;


// creating a function that calculates total price of meal after tax and tip
public class TotalMealPrice {
    public static double calculateTotalMealPrice(double mealPrice, double tipRate, double taxRate) {
        double tip = tipRate * mealPrice;
        double tax = taxRate * mealPrice;
        double total = mealPrice + tip + tax;
        return total;
    }
    // outputs the meal total and ask the user how many people are in their group
    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .20, .07);
        // prints total
        System.out.printf("The total meal costs $%.2f", groupTotalMealPrice);
        System.out.println(); // line break

        // ask how many are in the group
        Scanner input = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        int groupNumber = input.nextInt();

        // divides meal evenly based on user input
        double individualMealPrice = groupTotalMealPrice / groupNumber;
        System.out.printf("Each person will pay $%.2f", individualMealPrice);
    }
}

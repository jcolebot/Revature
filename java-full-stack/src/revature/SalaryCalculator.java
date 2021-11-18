package revature;

public class SalaryCalculator {

    public static double salaryInfo(double hoursPerWeek, double hourlyRate) {
        if(hoursPerWeek < 1) {
            return -1;
        }
        if(hourlyRate < 0) {
            return -1;
        }
        double weeklyPay = hoursPerWeek * hourlyRate;
        return weeklyPay * 52;
    }

    public static void main(String[] args) {
        double salary = salaryInfo(40, 20);
        System.out.println("Based on your hourly rate you will make $" + salary);
    }
}

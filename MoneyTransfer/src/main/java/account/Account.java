package account;

public class Account {

    private  String number;
    private double balance;

    // Constructor
    public Account(String number) {
        this.number = number;
    }
    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }
    // No arguments constructor
    public Account() {

    }
    // Accessor
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

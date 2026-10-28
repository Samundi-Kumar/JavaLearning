package day03;

public class EncapsulationDemo {

    private double balance = 1000;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        EncapsulationDemo account = new EncapsulationDemo();

        account.displayBalance();

        account.deposit(500);

        account.displayBalance();
    }
}
package day17.Sealed_Interface;

public final class CashPayment implements Payment {

    private double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
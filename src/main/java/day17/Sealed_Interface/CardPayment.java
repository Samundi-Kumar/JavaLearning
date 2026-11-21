package day17.Sealed_Interface;

public final class CardPayment implements Payment {

    private double amount;

    public CardPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
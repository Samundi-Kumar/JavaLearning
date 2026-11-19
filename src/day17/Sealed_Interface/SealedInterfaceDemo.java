package day17.Sealed_Interface;

public class SealedInterfaceDemo {

    public static void main(String[] args) {

        Payment card = new CardPayment(5000);

        Payment cash = new CashPayment(2000);

        System.out.println(
                "Card Payment: " + card.getAmount()
        );

        System.out.println(
                "Cash Payment: " + cash.getAmount()
        );
    }
}
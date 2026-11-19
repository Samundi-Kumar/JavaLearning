package day17;

import day17.Sealed_Interface.*;

public class PatternMatchingWithSwitch {

    public static void main(String[] args) {

        Payment payment1 = new CardPayment(5000);

        Payment payment2 = new CashPayment(2000);

        displayPayment(payment1);

        displayPayment(payment2);
    }

    static void displayPayment(Payment payment) {

        switch (payment) {

            case CardPayment card ->

                    System.out.println(
                            "Card Payment: " + card.getAmount()
                    );

            case CashPayment cash ->

                    System.out.println(
                            "Cash Payment: " + cash.getAmount()
                    );
        }
    }
}
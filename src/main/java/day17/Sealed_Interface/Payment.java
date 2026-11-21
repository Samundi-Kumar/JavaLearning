package day17.Sealed_Interface;

public sealed interface Payment
        permits CardPayment, CashPayment {

    double getAmount();
}
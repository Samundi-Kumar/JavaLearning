package day12.Sealed_Interface;

public sealed interface Payment
        permits CardPayment, CashPayment {

    double getAmount();
}
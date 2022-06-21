package com.company.creational.factorymethod;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typepayment){
        switch(typepayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
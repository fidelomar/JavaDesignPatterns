package com.company.creational.abstractfactory;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "000 000 000 VISA";
    }
}
package com.company.structural;

import com.company.behavioral.strategy.CapitalStrategyTextFormatter;
import com.company.behavioral.strategy.Context;
import com.company.behavioral.strategy.LowerStrategyTextFormatter;
import com.company.creational.abstractfactory.AbstractFactory;
import com.company.creational.abstractfactory.Card;
import com.company.creational.abstractfactory.FactoryProvider;
import com.company.creational.abstractfactory.PaymentMethod;
import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args){
       //probarFactoryMethod();
        //probarAbstractFactory();
        probarStrategy();
    }
    private static void probarStrategy(){
        Context context = new Context(new CapitalStrategyTextFormatter());
        context.publishText("Este texto será convertido a MAYUSCULAS a través del algoritmo");

        context = new Context(new LowerStrategyTextFormatter());
        context.publishText("Este texto SERA CONVERTIDO a MINUSCULAS a través del algoritmo");
    }
    private static void probarAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
                Card tarjeta = (Card) abstractFactory.create("VISA");
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

        System.out.println("Una tarjeta de tipo "+ tarjeta.getCardType() + " con el metodo de pago " + paymentMethod.doPayment());
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}

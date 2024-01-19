package org.example.strategy.implementations;

import org.example.strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {

    private String clientName;
    private String cardNumber;

    private String cvv;

    private String expirationDate;

    public CreditCardStrategy(String name, String number, String code, String expDate ){
        this.clientName = name;
        this.cardNumber = number;
        this.cvv = code;
        this.expirationDate = expDate;
    }

    @Override
    public void pay(int amount){
        System.out.println("method = credit card; amount = " + amount);
    }
}

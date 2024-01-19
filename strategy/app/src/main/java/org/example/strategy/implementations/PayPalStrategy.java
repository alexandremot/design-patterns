package org.example.strategy.implementations;

import org.example.strategy.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {

    private String emailId;

    private String password;

    public PayPalStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int ammount){
        System.out.println("method = paypal; ammount = " + ammount);
    }
}

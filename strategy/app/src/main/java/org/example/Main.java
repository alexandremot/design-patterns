package org.example;

import org.example.domain.ShoppingCart;
import org.example.reposiory.Item;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.implementations.CreditCardStrategy;
import org.example.strategy.implementations.PayPalStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart =  new ShoppingCart();

        Item item1 = new Item("1234", 50);

        Item item2 = new Item("7689", 25);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PayPalStrategy("alexandremot@gmail.com", "mypassword"));

        shoppingCart.pay(new CreditCardStrategy("Alexandre Mota", "88", "555", "14/31"));

    }
}
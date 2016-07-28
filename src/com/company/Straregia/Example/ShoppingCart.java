package com.company.Straregia.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(List<Item> items) {

        this.items = items;
    }

    public ShoppingCart() {
        items = new ArrayList<>();
    }


    public void addItem(Item item) {
        this.items.add(item);

    }

    public void romoveItem(Item item) {
        this.romoveItem(item);

    }


    public int calculateTotal() {
        int sum = 0;

        for (Item x : items)
            sum += x.getPrice();


        return sum;
    }

    public void pay(PaymentStategy paymentStategy) {
        int amout = calculateTotal();
        paymentStategy.pay(amout);
    }


    public static void main(String args[]) {

        ShoppingCart shopingCart = new ShoppingCart();
        Item item1 = new Item("Lamborgini", 10000000);
        Item item2 = new Item("Zuk", 50000123);

        shopingCart.addItem(item1);
        shopingCart.addItem(item2);

        shopingCart.pay(new PaypalStraregy("abc@gmapl.com", "alemamama"));
        shopingCart.pay(new CreditCardStrategy("Janusz", "1234113131", "123", "201434"));


    }
}

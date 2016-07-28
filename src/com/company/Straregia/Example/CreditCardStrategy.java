package com.company.Straregia.Example;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class CreditCardStrategy implements PaymentStategy {
    private String name;
    private String cardNumber;
    private String ccv;
    private String dateofExpiry;

    public CreditCardStrategy(String name, String cardNumber, String ccv, String dateofExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateofExpiry = dateofExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" :Amount  Pay with credite /Debit Card    ");
    }
}

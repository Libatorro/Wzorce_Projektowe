package com.company.Straregia.Example;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class PaypalStraregy implements PaymentStategy {

private String emailId;
    private String password;

    public PaypalStraregy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {

        System.out.println(amount + " Amount Pay with PayPal Stategy ");

    }
}

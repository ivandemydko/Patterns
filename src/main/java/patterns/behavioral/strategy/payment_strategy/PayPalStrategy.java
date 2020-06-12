package patterns.behavioral.strategy.payment_strategy;

import patterns.behavioral.strategy.payment_strategy.PayStrategy;

public class PayPalStrategy implements PayStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pay Pal payment on sum: " + amount + " $");
    }
}

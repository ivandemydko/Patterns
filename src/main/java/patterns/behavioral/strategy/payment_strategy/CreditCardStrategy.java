package patterns.behavioral.strategy.payment_strategy;


public class CreditCardStrategy implements PayStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment on sum: " + amount + " $");
    }
}

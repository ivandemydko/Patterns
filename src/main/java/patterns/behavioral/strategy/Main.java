package patterns.behavioral.strategy;

import patterns.behavioral.strategy.order.Order;
import patterns.behavioral.strategy.payment_strategy.CreditCardStrategy;
import patterns.behavioral.strategy.payment_strategy.PayPalStrategy;
import patterns.behavioral.strategy.payment_strategy.PayStrategy;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        PayStrategy payStrategy = new CreditCardStrategy();
        order.doOrderLogic(payStrategy, 18.18);

        System.out.println("-----------------------------------------------------------------");

        payStrategy = new PayPalStrategy();
        order.doOrderLogic(payStrategy, 20);

        System.out.println("-----------------------------------------------------------------");

        order.doOrderLogic(sum -> System.out.println("Other payment strategy on sum: " + sum + " $"), 69);

    }
}

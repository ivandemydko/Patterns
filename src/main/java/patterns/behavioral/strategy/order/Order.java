package patterns.behavioral.strategy.order;

import patterns.behavioral.strategy.payment_strategy.PayStrategy;

public class Order {

   public void doOrderLogic(PayStrategy payStrategy, double amount) {
        System.out.print("The order was processed. ");
        payStrategy.pay(amount);
    }
}

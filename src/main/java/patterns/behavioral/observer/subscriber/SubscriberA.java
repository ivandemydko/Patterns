package patterns.behavioral.observer.subscriber;

import patterns.behavioral.observer.subscriber.Subscriber;

public class SubscriberA implements Subscriber {


    @Override
    public void notifySubscriber() {
        System.out.print("Subscriber A was notified.");
        subscriberAAction();
    }

    void subscriberAAction() {
        System.out.println(" Subscriber A is doing something");
    }
}

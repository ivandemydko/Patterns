package patterns.behavioral.observer.subscriber;

import patterns.behavioral.observer.subscriber.Subscriber;

public class SubscriberB implements Subscriber {

    @Override
    public void notifySubscriber() {
        System.out.print("Subscriber B was notified.");
        subscriberAAction();
    }

    void subscriberAAction() {
        System.out.println(" Subscriber B is doing something");
    }
}

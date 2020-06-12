package patterns.behavioral.observer.editor_manager;

import patterns.behavioral.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EditorManager {
    Map<String, List<Subscriber>> eventsAndSubscribers;

    public EditorManager(String... events) {
        this.eventsAndSubscribers = new HashMap<>();
        for (String event : events) {
            eventsAndSubscribers.put(event, new ArrayList<>());
        }

    }

    public void subscribe(String event, Subscriber subscriber) {
        List<Subscriber> subscribers = eventsAndSubscribers.get(event);
        subscribers.add(subscriber);
    }

    public void notifyAllSubscriber(String event) {
        List<Subscriber> subscribers = eventsAndSubscribers.get(event);
        for (Subscriber s : subscribers) {
            s.notifySubscriber();
        }
    }
}

package patterns.behavioral.mediator;

import patterns.behavioral.mediator.components.Component;
import patterns.behavioral.mediator.components.ComponentA;
import patterns.behavioral.mediator.components.ComponentB;
import patterns.behavioral.mediator.mediators.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Component a = new ComponentA(mediator);
        Component b = new ComponentB(mediator);

        a.callMediator("A");
        System.out.println("--------------------------");

        b.callMediator("A");
        System.out.println("--------------------------");
        
        a.callMediator("B");
        System.out.println("--------------------------");

        b.callMediator("B");

    }
}

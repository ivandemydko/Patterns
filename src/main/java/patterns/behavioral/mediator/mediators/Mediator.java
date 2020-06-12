package patterns.behavioral.mediator.mediators;

import patterns.behavioral.mediator.components.Component;
import patterns.behavioral.mediator.components.ComponentA;
import patterns.behavioral.mediator.components.ComponentB;

public class Mediator {
    private ComponentA componentA;
    private ComponentB componentB;


   public void mediatorAction(Component component, String event) {
        if (component instanceof ComponentA) {
            if (event.equals("A")) {
                componentA.actionA();
            } else {
                componentA.actionB();
                componentB.actionB();
            }

        } else if (component instanceof ComponentB) {
            if (event.equals("A")) {
                componentB.actionA();
            } else {
                componentB.actionB();
                componentA.actionB();
            }
        }
    }

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }
}

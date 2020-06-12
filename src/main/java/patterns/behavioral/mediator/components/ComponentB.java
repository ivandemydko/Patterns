package patterns.behavioral.mediator.components;

import patterns.behavioral.mediator.mediators.Mediator;

public class ComponentB implements Component {
    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
        mediator.setComponentB(this);
    }

    @Override
    public void callMediator(String event) {
        mediator.mediatorAction(this, event);
    }

    @Override
    public void actionA() {
        System.out.println("ComponentB -> actionA");
    }

    @Override
    public void actionB() {
        System.out.println("ComponentB -> actionB");
    }
}

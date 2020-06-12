package patterns.behavioral.mediator.components;

import patterns.behavioral.mediator.mediators.Mediator;

public class ComponentA implements Component {
    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
        mediator.setComponentA(this);
    }

    @Override
    public void callMediator(String event) {
        mediator.mediatorAction(this, event);
    }

    @Override
    public void actionA() {
        System.out.println("ComponentA -> actionA");
    }

    @Override
    public void actionB() {
        System.out.println("ComponentA -> actionB");
    }


}

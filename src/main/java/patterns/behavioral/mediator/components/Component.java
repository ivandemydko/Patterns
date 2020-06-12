package patterns.behavioral.mediator.components;

public interface Component {

    void actionA();

    void actionB();

    void callMediator(String event);

}

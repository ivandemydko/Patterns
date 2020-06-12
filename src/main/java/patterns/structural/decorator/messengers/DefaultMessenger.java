package patterns.structural.decorator.messengers;

public class DefaultMessenger implements Messenger {

    @Override
    public void send() {
        System.out.println("Send message by e-mail(Default messenger)");
    }
}

package patterns.structural.decorator.messengers;

public class BaseMessenger implements Messenger {
    private Messenger messenger;

    public BaseMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void send() {
        messenger.send();
    }
}

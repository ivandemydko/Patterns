package patterns.structural.decorator.messengers;

public class ViberMessenger extends BaseMessenger {

    public ViberMessenger(Messenger messenger) {
        super(messenger);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Send message by viber(Viber Messenger)");
    }
}

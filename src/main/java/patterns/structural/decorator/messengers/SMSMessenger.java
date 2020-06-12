package patterns.structural.decorator.messengers;

public class SMSMessenger extends BaseMessenger {

    public SMSMessenger(Messenger messenger) {
        super(messenger);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Send SMS(SMS Messenger)");
    }
}

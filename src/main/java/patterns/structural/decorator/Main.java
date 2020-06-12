package patterns.structural.decorator;

import patterns.structural.decorator.messengers.DefaultMessenger;
import patterns.structural.decorator.messengers.Messenger;
import patterns.structural.decorator.messengers.SMSMessenger;
import patterns.structural.decorator.messengers.ViberMessenger;

public class Main {
    public static void main(String[] args) {


        Messenger messenger = new ViberMessenger(new SMSMessenger(new DefaultMessenger()));
        messenger.send();

        System.out.println("-------------------------------------------");

        messenger = new SMSMessenger(new DefaultMessenger());
        messenger.send();

    }
}

package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.application.Application;
import patterns.creational.abstract_factory.factories.MacFactory;
import patterns.creational.abstract_factory.factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {

        Application app = new Application(new WindowsFactory());
        app.createInterface();

        System.out.println("-------------------------");

        app = new Application(new MacFactory());
        app.createInterface();
    }
}

package patterns.creational.factory_method.logistic;

import patterns.creational.factory_method.logistic.Logistic;
import patterns.creational.factory_method.transport.Car;
import patterns.creational.factory_method.transport.Transport;

public class CarLogistic extends Logistic {

    Transport getAppropriateTransport() {
        return new Car();
    }
}

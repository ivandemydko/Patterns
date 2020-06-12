package patterns.creational.factory_method.logistic;


import patterns.creational.factory_method.transport.AirPlane;
import patterns.creational.factory_method.transport.Transport;

public class AirLogistic extends Logistic {

    Transport getAppropriateTransport() {
        return new AirPlane();
    }
}

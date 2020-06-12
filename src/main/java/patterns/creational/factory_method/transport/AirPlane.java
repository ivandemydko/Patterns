package patterns.creational.factory_method.transport;

import patterns.creational.factory_method.transport.Transport;

public class AirPlane extends Transport {

    public AirPlane() {
        super("plane", 100, 1200);
    }
}

package patterns.creational.factory_method.logistic;

import patterns.creational.factory_method.transport.Transport;

public abstract class Logistic {

   private Transport transport;

    public void doLogisticAction() {
        transport = getAppropriateTransport();
        transport.doAction();
    }


     abstract Transport getAppropriateTransport();
}

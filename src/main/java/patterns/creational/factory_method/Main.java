package patterns.creational.factory_method;

import patterns.creational.factory_method.logistic.AirLogistic;
import patterns.creational.factory_method.logistic.CarLogistic;
import patterns.creational.factory_method.logistic.Logistic;

public class Main {
    public static void main(String[] args) {

        Logistic logistic = new AirLogistic();
        logistic.doLogisticAction();

        logistic = new CarLogistic();
        logistic.doLogisticAction();
    }
}

package patterns.behavioral.template_method;

import patterns.behavioral.template_method.logisric.AirLogistic;
import patterns.behavioral.template_method.logisric.CarLogistic;
import patterns.behavioral.template_method.logisric.InternationalLogistic;
import patterns.behavioral.template_method.logisric.Logistic;

public class Main {
    public static void main(String[] args) {

        Logistic logistic = new CarLogistic();
        logistic.doLogistic();

        System.out.println("-------------------------------------");

        logistic = new AirLogistic();
        logistic.doLogistic();

        System.out.println("-------------------------------------");

        logistic = new InternationalLogistic();
        logistic.doLogistic();

    }
}

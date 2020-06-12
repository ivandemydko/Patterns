package patterns.behavioral.template_method.logisric;

public class CarLogistic extends Logistic {

    @Override
    public void transport() {
        System.out.println("Cargo is transported by car");
    }
}

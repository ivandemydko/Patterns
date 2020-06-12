package patterns.behavioral.template_method.logisric;

public class InternationalLogistic extends Logistic {

    @Override
    public void transport() {
        System.out.println("Cargo is transported by different vehicles");
    }

    @Override
    public void hook() {
        System.out.println("paperwork");
    }
}

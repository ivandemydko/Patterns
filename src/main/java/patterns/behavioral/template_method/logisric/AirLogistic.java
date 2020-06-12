package patterns.behavioral.template_method.logisric;

public class AirLogistic extends Logistic {

    @Override
    public void transport() {
        System.out.println("Cargo is transported by airplane");
    }
}

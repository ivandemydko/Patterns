package patterns.behavioral.template_method.logisric;

public abstract class Logistic {

    final public void doLogistic() {
        hook();
        loadCargo();
        transport();
        unloadCargo();
        hook();
    }

    public void loadCargo() {
        System.out.println("Cargo is loaded");
    }

    public void unloadCargo() {
        System.out.println("Cargo is unloaded");
    }

    public abstract void transport();

    public void hook() {

    }
}

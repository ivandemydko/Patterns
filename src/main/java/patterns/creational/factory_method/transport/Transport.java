package patterns.creational.factory_method.transport;

public abstract class Transport {

    private String type;
    private double capacity;
    private int speed;

    public Transport(String type, double capacity, int speed) {
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void doAction() {
        System.out.println(type + " is moving with " + capacity + " tons of cargo on board , with speed of " + speed + " km/h");
    }
}

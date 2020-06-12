package patterns.creational.builder.entity;

public class Manual {

    private String type;
    private double engine;
    private int seats;
    private String transmission;
    private boolean GPS;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void print() {
        System.out.println("Definition: " + this.toString());
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", engine=" + engine +
                ", seats=" + seats +
                ", transmission='" + transmission + '\'' +
                ", GPS=" + GPS +
                '}';
    }
}

package patterns.creational.builder.builders;

public interface Builder<T> {

    void init();
    void setType(String type);
    void setEngine(double engine);
    void setSeats(int seats);
    void setGPS(boolean gps);
    void setTransmission(String transmission);

    T getResult();
}

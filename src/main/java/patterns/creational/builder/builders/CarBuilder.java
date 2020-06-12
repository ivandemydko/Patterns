package patterns.creational.builder.builders;

import patterns.creational.builder.entity.Car;

public class CarBuilder implements Builder<Car> {
    private Car car;

    @Override
    public void init() {
        car = new Car();
    }

    @Override
    public void setType(String type) {
        car.setType(type);
    }

    @Override
    public void setEngine(double engine) {
        car.setEngine(engine);
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setGPS(boolean gps) {
        car.setGPS(gps);
    }

    @Override
    public void setTransmission(String transmission) {
        car.setTransmission(transmission);
    }

    @Override
    public Car getResult() {
        return car;
    }


}

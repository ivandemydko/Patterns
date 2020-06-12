package patterns.creational.builder.director;

import patterns.creational.builder.builders.Builder;

public class Director {

    public void createSportCar(Builder builder) {
        builder.init();
        builder.setType("SPORT");
        builder.setEngine(3.0);
        builder.setGPS(true);
        builder.setTransmission("mechanic");
        builder.setSeats(2);

    }

    public void createCargoCar(Builder builder) {
        builder.init();
        builder.setType("CARGO");
        builder.setEngine(12.0);
        builder.setGPS(true);
        builder.setTransmission("mechanic");
        builder.setSeats(3);

    }

    public void createCityCar(Builder builder) {
        builder.init();
        builder.setType("CITY");
        builder.setEngine(1.3);
        builder.setGPS(true);
        builder.setTransmission("automatic");
        builder.setSeats(5);

    }

}

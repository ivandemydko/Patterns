package patterns.creational.builder.builders;

import patterns.creational.builder.entity.Manual;

public class ManualBuilder implements Builder<Manual> {

    private Manual manual;

    @Override
    public void init() {
        manual = new Manual();
    }

    @Override
    public void setType(String type) {
        manual.setType(type);
    }

    @Override
    public void setEngine(double engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setGPS(boolean gps) {
        manual.setGPS(gps);
    }

    @Override
    public void setTransmission(String transmission) {
        manual.setTransmission(transmission);
    }

    @Override
    public Manual getResult() {
        return manual;
    }
}

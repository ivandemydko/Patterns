package patterns.creational.builder;

import patterns.creational.builder.builders.Builder;
import patterns.creational.builder.builders.CarBuilder;
import patterns.creational.builder.builders.ManualBuilder;
import patterns.creational.builder.director.Director;
import patterns.creational.builder.entity.Car;
import patterns.creational.builder.entity.Manual;

public class Main {
    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Director director = new Director();
        director.createSportCar(builder);
        Car car = (Car) builder.getResult();
        System.out.println(car);

        System.out.println("-----------------------------------------------------------------------------------");

        builder = new ManualBuilder();
        director.createSportCar(builder);
        Manual manual = (Manual) builder.getResult();
        manual.print();

    }
}

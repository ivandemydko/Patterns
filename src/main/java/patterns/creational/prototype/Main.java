package patterns.creational.prototype;

import patterns.creational.prototype.entity.Circle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(23,4,7);
        Circle anotherCircle = circle.clone();

        System.out.println(anotherCircle == circle);
        System.out.println(anotherCircle.equals(circle));


    }
}

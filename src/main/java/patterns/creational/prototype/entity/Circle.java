package patterns.creational.prototype.entity;

public class Circle extends Shape {

    int radius;

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }


    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle circle = (Circle) obj;
        return circle.radius == radius;
    }

}

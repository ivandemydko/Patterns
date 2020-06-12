package patterns.creational.prototype.entity;


public abstract class Shape {

    int x;
    int y;

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape)) return false;
        Shape shape = (Shape) obj;
        return shape.x == x && shape.y == y;
    }

}

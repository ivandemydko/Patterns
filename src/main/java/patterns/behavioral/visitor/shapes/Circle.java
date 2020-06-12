package patterns.behavioral.visitor.shapes;

import patterns.behavioral.visitor.shapes.Shape;
import patterns.behavioral.visitor.visitors.Visitor;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}

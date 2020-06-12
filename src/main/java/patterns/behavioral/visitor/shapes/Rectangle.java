package patterns.behavioral.visitor.shapes;

import patterns.behavioral.visitor.shapes.Shape;
import patterns.behavioral.visitor.visitors.Visitor;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}

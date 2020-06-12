package patterns.behavioral.visitor.visitors;

import patterns.behavioral.visitor.shapes.Circle;
import patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {

    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);
}

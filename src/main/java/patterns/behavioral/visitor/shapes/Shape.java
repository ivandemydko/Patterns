package patterns.behavioral.visitor.shapes;

import patterns.behavioral.visitor.visitors.Visitor;

public interface Shape {

    void draw();

    void accept(Visitor visitor);
}

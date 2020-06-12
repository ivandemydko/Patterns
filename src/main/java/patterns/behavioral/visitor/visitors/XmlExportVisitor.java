package patterns.behavioral.visitor.visitors;

import patterns.behavioral.visitor.shapes.Circle;
import patterns.behavioral.visitor.shapes.Rectangle;

public class XmlExportVisitor implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Export circle to XML.");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Export rectangle to XML.");
    }
}

package patterns.behavioral.visitor;

import patterns.behavioral.visitor.shapes.Circle;
import patterns.behavioral.visitor.shapes.Rectangle;
import patterns.behavioral.visitor.shapes.Shape;
import patterns.behavioral.visitor.visitors.Visitor;
import patterns.behavioral.visitor.visitors.XmlExportVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        Shape s3 = new Rectangle();
        Shape s4 = new Circle();

        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);
        shapes.add(s4);

        Visitor visitor = new XmlExportVisitor();

        for (Shape s:shapes) {
            s.accept(visitor);
        }
    }
}

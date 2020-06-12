package patterns.creational.abstract_factory.elements;

import patterns.creational.abstract_factory.elements.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}

package patterns.creational.abstract_factory.elements;

import patterns.creational.abstract_factory.elements.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}

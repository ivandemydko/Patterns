package patterns.creational.abstract_factory.elements;

import patterns.creational.abstract_factory.elements.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Mac checkbox");
    }
}

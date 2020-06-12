package patterns.creational.abstract_factory.elements;

import patterns.creational.abstract_factory.elements.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}

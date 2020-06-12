package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.elements.Button;
import patterns.creational.abstract_factory.elements.Checkbox;
import patterns.creational.abstract_factory.elements.MacButton;
import patterns.creational.abstract_factory.elements.MacCheckbox;
import patterns.creational.abstract_factory.factories.GUIFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

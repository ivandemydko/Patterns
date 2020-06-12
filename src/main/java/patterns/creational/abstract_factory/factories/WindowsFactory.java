package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.elements.WindowsButton;
import patterns.creational.abstract_factory.elements.WindowsCheckbox;
import patterns.creational.abstract_factory.elements.Button;
import patterns.creational.abstract_factory.elements.Checkbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.elements.Button;
import patterns.creational.abstract_factory.elements.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}

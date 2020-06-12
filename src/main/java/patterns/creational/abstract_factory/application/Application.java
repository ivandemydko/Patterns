package patterns.creational.abstract_factory.application;

import patterns.creational.abstract_factory.elements.Button;
import patterns.creational.abstract_factory.elements.Checkbox;
import patterns.creational.abstract_factory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void createInterface() {
        button.paint();
        checkbox.paint();
    }
}

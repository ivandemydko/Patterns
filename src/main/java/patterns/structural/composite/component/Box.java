package patterns.structural.composite.component;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    private List<Component> components = new ArrayList<>();


    @Override
    public double price() {
        double price = 0;
        for (Component c : components) {
            price += c.price();
        }
        return price;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void delete(Component component) {
        components.remove(component);
    }


}

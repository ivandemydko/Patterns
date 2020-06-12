package patterns.structural.composite.component;

public interface Component {

    double price();

    void add(Component component);

    void delete(Component component);
}

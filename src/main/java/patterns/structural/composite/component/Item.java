package patterns.structural.composite.component;

public class Item implements Component {

   private double price;

    public Item(double price) {
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Component component) {
        throw new UnsupportedOperationException();
    }
}

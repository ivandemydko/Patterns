package patterns.structural.composite;

import patterns.structural.composite.component.Box;
import patterns.structural.composite.component.Component;
import patterns.structural.composite.component.Item;

public class Main {
    public static void main(String[] args) {

        Component cpu = new Item(50);
        Component motherboard = new Item(25);
        Component memory = new Item(25);

        Component innerBox = new Box();
        innerBox.add(cpu);
        innerBox.add(motherboard);

        Component outerBox = new Box();
        outerBox.add(memory);
        outerBox.add(innerBox);

        System.out.println(outerBox.price());

    }
}

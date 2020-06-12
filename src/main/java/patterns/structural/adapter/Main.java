package patterns.structural.adapter;

import patterns.structural.adapter.elements.RoundHole;
import patterns.structural.adapter.elements.RoundPeg;
import patterns.structural.adapter.elements.SquarePeg;
import patterns.structural.adapter.elements.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole=new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.isFit(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.isFit(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.isFit(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.isFit(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

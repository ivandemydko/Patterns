package patterns.structural.adapter.elements;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean isFit(RoundPeg roundPeg) {
        return radius >= roundPeg.getRadius();
    }
}

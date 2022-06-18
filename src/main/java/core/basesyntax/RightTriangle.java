package core.basesyntax;

public class RightTriangle extends Figures {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "right triangle, area: " + this.area() + " sq.units, first leg: "
                + this.firstLeg + " units, second leg: "
                + this.secondLeg + " units, color: " + getColor();
    }

    @Override
    public double area() {
        return firstLeg * secondLeg / 2;
    }
}

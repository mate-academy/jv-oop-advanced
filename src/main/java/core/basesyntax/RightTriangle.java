package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public String draw() {
        return "Figure - rectangle, area = " + String.format("%1f", getArea()).replace(",", ".")
                + " sq.units, firstLeg = " + firstLeg + " units, secondLeg = " + secondLeg
                + " units, color - " + getColor();
    }
}

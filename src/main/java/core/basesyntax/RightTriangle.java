package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: "
                + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}

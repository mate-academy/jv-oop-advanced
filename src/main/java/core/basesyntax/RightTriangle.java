package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 1.0 / 2 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return String.format("Figure: Triangle, area: %.2f sq.units, firstLeg %.3f units, "
                + "secondLeg: %.3f units, color: %s", getArea(), firstLeg, secondLeg, getColor());
    }
}

package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(Figure.RIGHT_TRIANGLE.name(), color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, first leg: %.0f units,"
                        + " second leg: %.0f units, color: %s",
                getType(), getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, first leg: %.0f units,"
                        + " second leg: %.0f units, color: %s",
                this.getClass().getSimpleName(), getArea(), firstLeg,
                secondLeg, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

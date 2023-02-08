package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super("Right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, first leg: %.0f units,"
                        + " second leg: %.0f units, color: %s",
                getType(),area(),firstLeg,secondLeg,getColor());
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }
}

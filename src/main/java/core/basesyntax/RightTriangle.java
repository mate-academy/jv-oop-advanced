package core.basesyntax;

public class RightTriangle extends Figure {

    private static final FigureShape shape = FigureShape.RIGHT_TRIANGLE;
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "firstLeg: %f units, secondLeg: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), firstLeg, secondLeg, color);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

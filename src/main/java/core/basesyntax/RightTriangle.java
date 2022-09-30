package core.basesyntax;

public class RightTriangle extends Figure {
    private static final FigureShape shape = FigureShape.RIGHT_TRIANGLE;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color, shape.name());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "firstLeg: %f units, secondLeg: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), firstLeg, secondLeg, getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}

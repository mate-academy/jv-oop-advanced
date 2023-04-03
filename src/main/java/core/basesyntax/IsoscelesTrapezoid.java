package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private final double middleLine;
    private final double height;

    public IsoscelesTrapezoid(String color, double middleLine, double height) {
        super(color);
        this.middleLine = middleLine;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return middleLine * height;
    }

    @Override
    public String draw() {
        return String.format("Figure: isosceles trapezoid, area: %.2f sq.units, "
                        + "middleLine: %.2f units, height: %.2f units, color: %s",
                calculateArea(), middleLine, height, getColor());
    }
}

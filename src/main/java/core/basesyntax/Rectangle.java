package core.basesyntax;

public class Rectangle extends Figure {

    private static final FigureShape shape = FigureShape.RECTANGLE;
    private final double length;
    private final double width;
    private final String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "length: %f units, width: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), length, width, color);
    }

    @Override
    public double getArea() {
        return 0;
    }
}

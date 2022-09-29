package core.basesyntax;

public class Circle extends Figure {
    private static final FigureShape shape = FigureShape.CIRCLE;
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Figure: %s, area: %f sq.units, radius: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), radius, color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

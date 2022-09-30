package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %.2f sq.units, radius: %.2f units, color: %s",
                Circle.class.getSimpleName().toLowerCase(),
                getArea(), radius, getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.2f sq.units, radius: %d units,"
                + "color: %s", getName(), getArea(), radius, getColor());
    }
}

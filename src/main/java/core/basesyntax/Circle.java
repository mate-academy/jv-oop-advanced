package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return String.format("Figure: Circle, area: %.2f sq.units, radius: %.3f units, color: %s",
                getArea(), radius, getColor());
    }
}

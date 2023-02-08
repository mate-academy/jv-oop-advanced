package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, radius: %.0f units, color: %s",
                getType(),area(),radius,getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

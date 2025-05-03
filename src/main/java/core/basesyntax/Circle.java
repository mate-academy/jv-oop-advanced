package core.basesyntax;

public class Circle extends AbstractFigure implements AreaCalculator {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        this.radius = radius;
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.2f sq. units, "
                + "radius: %.2f units, color: %s%n", getArea(), radius, getColor());
    }
    @Override
    public String toString() {
        return String.format("Circle{radius=%.2f, color=%s}", radius, color);
    }

package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Shape: Circle, area = %.3f sq.units, radius = %.3f units"
                + ", color - %s\n", calculateArea(), radius, getColor());
    }
}

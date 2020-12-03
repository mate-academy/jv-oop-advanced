package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String draw() {
        return String.format("Circle: radius: %.2f units, perimeter: %.2f units,"
                        + " area: %.2f units, color: %s.",
                radius, getPerimeter(), getArea(), getColour());
    }
}

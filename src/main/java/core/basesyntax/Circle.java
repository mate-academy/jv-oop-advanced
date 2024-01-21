package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return getRadius() * getRadius();
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Circle, radius " + getRadius()
                + " units, area: " + calculateArea()
                + "sq. units, color " + getColor());
    }
}

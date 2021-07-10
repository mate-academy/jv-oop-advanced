package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, InfoBox {
    private double radius;

    // CONSTRUCTORS
    public Circle(double radius) {
        this.radius = radius;
    }

    // GETTERS & SETTERS
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // BODY
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}

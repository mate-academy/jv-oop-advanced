package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI + Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius " + radius + " and colour " +
                getColor() + " area " + calculateArea());
    }
}

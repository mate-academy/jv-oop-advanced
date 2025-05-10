package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        double area = radius * radius * Math.PI;
        return Math.floor(area * 100) / 100.0;
    }

    public void display() {
        System.out.println("Figure: circle," + " area: " + calculateArea() + " sq.units,"
                + " radius: " + getRadius() + " units," + " color: " + getColor());
    }
}

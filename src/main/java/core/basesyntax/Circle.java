package core.basesyntax;

public class Circle extends Figure implements Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}

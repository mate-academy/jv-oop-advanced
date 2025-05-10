package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, color: "
                + getColor() + ", radius: " + radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

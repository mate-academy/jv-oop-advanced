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
    public double findArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure, circle, area " + findArea() + "sq.units, "
                + "radius: " + getRadius() + " units, " + " color: " + this.getColor());
    }
}

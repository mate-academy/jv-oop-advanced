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
    public double areaCalculator() {
        final double pi = 3.14;
        return pi * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + areaCalculator() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}

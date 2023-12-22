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
        return 3.14 * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + areaCalculator() + " sq. units, radius: "
                + getRadius() + " units, color: "
                + getColor());
    }
}

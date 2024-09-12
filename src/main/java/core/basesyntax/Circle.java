package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + areaCalculator()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return Math.PI * radius * radius;
    }
}

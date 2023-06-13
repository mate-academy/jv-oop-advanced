package core.basesyntax.figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.2f sq.units, radius: %.2f units, color: %s%n",
                getArea(), radius, getColor());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

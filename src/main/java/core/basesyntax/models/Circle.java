package core.basesyntax.models;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq.units, radius: %.2f units, color: %s%n",
                getClass().getSimpleName(),
                getArea(),
                radius,
                color.toLowerCase()
        );
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

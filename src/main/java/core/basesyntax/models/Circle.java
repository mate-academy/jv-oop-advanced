package core.basesyntax.models;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius, double area) {
        super(color, area);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius + ", color: " + getColor();
    }

    @Override
    public String draw(Object o) {
        return o.toString();
    }
}

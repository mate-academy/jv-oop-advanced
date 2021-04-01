package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq. units, radius: " + String.format("%.1f", radius)
                + " units, color:" + getColor());
    }
}

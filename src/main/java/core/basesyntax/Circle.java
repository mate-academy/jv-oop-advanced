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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.unit, radius: "
                + radius + " units, color: " + getColor());
    }
}

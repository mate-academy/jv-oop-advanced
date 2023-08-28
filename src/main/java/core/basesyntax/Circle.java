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
    public void draw() {
        System.out.println("" + getColor() + " circle with area of " + getArea()
                + " sq.units and radius of " + radius + " units");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

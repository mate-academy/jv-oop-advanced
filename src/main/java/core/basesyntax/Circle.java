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
        System.out.println("Circle with radius of " + radius + " and " + getColor() + " color");
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

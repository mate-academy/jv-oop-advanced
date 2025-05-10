package core.basesyntax;

public class Circle extends Figure {
    public static final double MAX_RADIUS = 100;
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + ", radius: " + radius
                + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new RuntimeException("Radius may be more than 0!");
        }
    }

    public double getDiameter() {
        return radius * 2;
    }
}

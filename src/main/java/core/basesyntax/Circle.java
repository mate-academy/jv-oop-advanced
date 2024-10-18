package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + "color=" + getColor()
                + "}";
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

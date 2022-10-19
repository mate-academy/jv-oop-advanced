package core.basesyntax.figures;

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
    public double calculate() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius()
                + ", color='" + getColor()
                + ", area='" + calculate()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}

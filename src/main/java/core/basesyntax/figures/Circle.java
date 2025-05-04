package core.basesyntax.figures;

public class Circle extends AbstractFigure {
    private double radius;
    private final String color;

    public Circle(double radius, String color) {
        setRadius(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String getSize() {
        return "radius: " + getRadius() + " units,";
    }

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }
}

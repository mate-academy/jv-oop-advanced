package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be > 0");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String getTypeFigure() {
        return "Circle";
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea()
                + " sq. units" + " side: " + getRadius()
                + ", color: " + getColor();
    }

    public double getRadius() {
        return radius;
    }
}

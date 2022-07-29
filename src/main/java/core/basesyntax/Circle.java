package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "circle, area: " + getArea() + " sq.units, radius: "
                + radius + ", color: " + getColor();
    }

    @Override
    public String toString() {
        return "circle,"
                + " radius: " + radius
                + " color: " + getColor();
    }
}

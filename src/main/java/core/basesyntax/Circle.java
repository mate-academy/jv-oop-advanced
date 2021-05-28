package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "area="
                + getArea()
                + " sq.units"
                + ", radius="
                + radius
                + " units"
                + ", color='"
                + color
                + '\''
                + '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius * 2;
    }
}

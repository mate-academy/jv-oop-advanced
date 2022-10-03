package core.basesyntax;

public class Circle extends Figure implements Area {
    private final double radius;
    ColorSupplier supplier = new ColorSupplier();

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: " + radius + " units, color: "
                + color;
    }
}

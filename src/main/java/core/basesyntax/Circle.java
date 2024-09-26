package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getValue() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: "
                + String.valueOf(radius) + " units, color: "
                + getColor();
    }
}

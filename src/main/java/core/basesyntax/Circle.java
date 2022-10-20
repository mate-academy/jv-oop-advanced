package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + color.toLowerCase();
    }
}

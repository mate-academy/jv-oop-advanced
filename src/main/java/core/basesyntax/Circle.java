package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        radius = a;
    }

    @Override
    public double getSquare() {
        return (int) Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "circle, area: " + getSquare()
                + " sq.units, radius: " + radius
                + " units, color: " + color.toLowerCase();
    }
}

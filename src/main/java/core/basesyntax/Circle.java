package core.basesyntax;

public class Circle extends Figure {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super(DEFAULT_COLOR);
        this.radius = DEFAULT_RADIUS;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: Circle, " + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, " + "color: " + getColor();
    }
}

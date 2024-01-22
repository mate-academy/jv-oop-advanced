package core.basesyntax.model;

public class Circle extends Figure {
    private static final double PI = 3.14159265359;
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + calculateArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + color + ".";
    }
}

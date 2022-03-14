package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double area, Color color, double radius) {
        super(name, area, color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: " + name
                + ", area: " + area
                + " sq.units, radius: " + radius
                + " units, color: " + color;
    }
}

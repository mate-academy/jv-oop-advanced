package core.basesyntax;

public class Circle extends Figure {
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    private final int radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "circle, "
                + "area: " + String.format("%.2f", calculateArea()) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().toLowerCase();
    }
}

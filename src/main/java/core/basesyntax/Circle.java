package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, "
                + "area: " + getArea() + " sq. units"
                + ", radius: " + radius + " units"
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }
}

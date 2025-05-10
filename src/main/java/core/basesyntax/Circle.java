package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().toLowerCase();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return this.toString();
    }
}

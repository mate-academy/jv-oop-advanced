package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.ceil(Math.PI * radius * radius) * 10 / 10;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor().toLowerCase();
    }
}

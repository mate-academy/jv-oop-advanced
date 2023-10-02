package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle (double radius, String color) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: circle, "
                + "area: " + getArea()
                + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + super.getColor().toLowerCase();
    }
}

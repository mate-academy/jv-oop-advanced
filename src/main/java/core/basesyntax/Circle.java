package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        super.setColor();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius;
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

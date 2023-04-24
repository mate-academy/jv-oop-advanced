package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: "
                + getColor();
    }
}

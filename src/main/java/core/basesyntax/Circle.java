package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, radius: %.0f units, color: %s",
                this.getClass().getSimpleName(), getArea(),
                radius, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

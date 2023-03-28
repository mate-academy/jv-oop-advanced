package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String draw() {
        return String.format("Figure: circle, area: %.2f sq.units, "
                + "radius: %.2f units, color: %s",
                calculateArea(), radius, getColor());
    }
}

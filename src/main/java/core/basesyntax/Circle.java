package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(final String color, final double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: Circle, area: %.1f sq.units, radius: %.1f units, color: %s%n",
                this.getArea(), this.radius, super.getColor()
        );
    }
}

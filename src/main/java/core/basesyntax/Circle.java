package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, "
                + "area: %.1f sq. units, "
                + "radius: %.1f units, "
                + "color: %s%n",
                getArea(), radius, color.name().toLowerCase());
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.1f sq.units, "
                        + "radius: %.1f units, "
                        + "color: %s\n",
                getName(), getArea(), radius, getColor());
    }
}

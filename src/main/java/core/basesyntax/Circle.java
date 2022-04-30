package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "circle";
    private final int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double areaCalculator() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d, color: %s\n",
                name, areaCalculator(), radius, getColor().toString());
    }
}

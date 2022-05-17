package core.basesyntax;

public class Circle extends Figure {
    private static final String NAME = "circle";
    private final int radius;

    public Circle(Colors color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d, color: %s\n",
                NAME, calculateArea(), radius, getColor().toString());
    }
}

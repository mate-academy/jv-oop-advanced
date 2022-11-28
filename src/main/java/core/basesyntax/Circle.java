package core.basesyntax;

public class Circle extends Figure {
    private static final String FORM = "Figure: circle, area: %.1f sq.units, radius: %d units"
            + ", color: %s";
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(FORM, getArea(), radius, getColor()));
    }
}

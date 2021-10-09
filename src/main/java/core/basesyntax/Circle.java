package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units,"
                + " radius: %.1f units, diagonal: %.1f units, "
                + "color: %s%n", getArea(), radius, radius * 2, getColor());
    }
}

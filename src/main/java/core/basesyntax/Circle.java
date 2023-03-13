package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                "circle", getArea(), radius, getColor());
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final String color;

    public Circle(String color, double units) {
        this.color = color;
        this.radius = units;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.format("Figure: %s, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                "circle", getArea(), radius, color);
    }
}

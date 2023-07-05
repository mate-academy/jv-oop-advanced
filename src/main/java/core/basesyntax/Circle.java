package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.sqrt(radius) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.2f sq.units, radius: %.2f units, color: %s%n",
                getArea(), radius, getColor());
    }
}

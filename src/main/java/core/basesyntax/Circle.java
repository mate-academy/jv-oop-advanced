package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: circle, area: %.2f sq.units, radius: %.2f, color: %s%n",
                this.getArea(), radius, this.getColor());
    }
}

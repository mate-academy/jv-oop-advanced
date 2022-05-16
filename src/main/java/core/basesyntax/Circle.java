package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                calculateArea(), radius, getColor());
    }
}

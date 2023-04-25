package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: %.3f sq.units, radius: %s units, "
                        + "color: %s",
                calculateArea(), radius, color));
    }
}

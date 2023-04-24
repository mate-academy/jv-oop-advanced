package core.basesyntax;

public class Circle extends Figure {
    private final String name;
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        name = "circle";
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.3f sq.units, radius: %s units, "
                        + "color: %s",
                name, getArea(), radius, color));
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double radius, Color color) {
        super(name, color);
        this.radius = radius;
    }

    public Circle(double radius, Color color) {
        this("Circle", radius, color);
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.2f sq.units, "
                        + "radius: %.2f units, color: %s",
                getName(), getArea(), radius, getColor()));
    }
}

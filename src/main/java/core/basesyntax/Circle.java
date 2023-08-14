package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: %.1f sq.units, radius: %.1f, "
                        + "color: %s", calculateArea(), getRadius(), getColor()));
    }
}

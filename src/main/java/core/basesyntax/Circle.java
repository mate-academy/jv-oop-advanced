package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, "
                + "area: %.2f sq.units, "
                + "radius: %d units, color: %s"
                + System.lineSeparator(), getArea(), radius, getColor());
    }
}

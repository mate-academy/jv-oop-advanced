package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %.1f units, color: %s\n",
                getArea(), radius, getColor());
    }
}

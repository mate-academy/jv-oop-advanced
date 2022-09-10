package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.format("Figure: circle, color: %s, area = %.2f, radius = %.2f\n",
                getColor().toLowerCase(), getArea(), radius);
    }
}

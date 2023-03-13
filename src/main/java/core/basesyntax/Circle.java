package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f sq.units, radius: %f units, color: %s \n",
                name, getArea(), radius, color);
    }
}

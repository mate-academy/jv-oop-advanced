package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private double radius;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units, radius: " + radius
                + " units, color: " + color);
    }
}

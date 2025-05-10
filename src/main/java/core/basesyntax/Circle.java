package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units, radius: " + radius
                + " units, color: " + color);
    }
}

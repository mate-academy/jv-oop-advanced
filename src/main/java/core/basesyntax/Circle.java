package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.2f",getArea())
                + " sq.units, radius: "
                + String.format("%.2f",getRadius()) + " units, color: " + getColor());
    }
}

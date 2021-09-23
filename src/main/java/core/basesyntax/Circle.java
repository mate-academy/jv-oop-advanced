package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        this.radius = 1 + Math.random() * 15;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.2f",getArea())
                + " sq.units, radius: "
                + String.format("%.2f",getRadius()) + " units, color: " + getColor());
    }
}

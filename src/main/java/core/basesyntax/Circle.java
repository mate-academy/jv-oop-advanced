package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Colors color, double radius) {
        super(Colors.valueOf(String.valueOf(color)));
        this.radius = (int) radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + (int) radius + " units, color: " + color);
    }
}

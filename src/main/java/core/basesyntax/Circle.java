package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + radius + " units, "
                + "color: " + color);
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

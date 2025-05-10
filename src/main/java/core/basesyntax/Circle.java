package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, "
                + "area " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().toLowerCase());;
    }
}

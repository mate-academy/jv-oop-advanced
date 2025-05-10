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
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String draw() {
        System.out.println(("Figure: Circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor()));
        return null;
    }
}

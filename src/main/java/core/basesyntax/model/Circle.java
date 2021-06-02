package core.basesyntax.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String name, String color) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq.units, radius: " + radius
                + " units: color " + getColor());
    }
}

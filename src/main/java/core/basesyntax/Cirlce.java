package core.basesyntax;

public class Cirlce extends Figure {
    private double radius;

    public Cirlce(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Cirlce, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units: color " + getColor());
    }
}

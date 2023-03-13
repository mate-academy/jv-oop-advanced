package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units,"
                + " radius: " + radius + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

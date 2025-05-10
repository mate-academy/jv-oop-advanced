package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area " + getArea() + " sq.units, radius "
                + getRadius() + " units, color " + getColor();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, radius: "
                + getRadius() + ", color: " + getColor());
    }
}

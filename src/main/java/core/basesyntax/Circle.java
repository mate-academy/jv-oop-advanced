package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private int radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: circle,"
                + " area: " + this.getArea() + " sq.units, "
                + "radius: " + this.getRadius() + " units, "
                + "color: " + this.getColor();
    }
}

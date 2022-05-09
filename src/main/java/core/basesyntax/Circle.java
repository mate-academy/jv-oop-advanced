package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: "
                + getClass().getSimpleName() + ","
                + " area: " + getArea() + " sq.units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor();
    }
}

package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}

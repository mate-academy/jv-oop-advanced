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
    public void print() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}

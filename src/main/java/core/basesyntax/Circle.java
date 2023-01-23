package core.basesyntax;

public class Circle extends Figure {
    protected int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
        public void draw() {
        System.out.println("Figure: Circle, " + " area: " + getRadius() + " sq.units, "
                + "color: " + getColor());
    }

    @Override
        public double getArea() {
        return Math.PI * radius * radius;
    }
}

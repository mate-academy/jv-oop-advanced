package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + getColor());
    }
}

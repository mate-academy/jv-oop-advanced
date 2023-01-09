package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}

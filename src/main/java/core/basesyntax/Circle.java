package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", color=" + getColor()
                + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle"
                + ", area:" + getArea()
                + " sq.units"
                + ", radius:" + radius
                + " units"
                + ", color:" + getColor());
    }
}

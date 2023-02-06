package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "circle";
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public Circle(int radius, Colors color) {
        setRadius(radius);
        setColor(color);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + ", radius: " + getRadius() + ", color: " + getColor());
    }
}

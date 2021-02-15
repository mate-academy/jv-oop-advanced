package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.floor(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: сircle, " + "area: " + getArea() + ", radius: " + radius
                + ", color: " + getColor());
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius="
                + radius
                + "}";
    }
}

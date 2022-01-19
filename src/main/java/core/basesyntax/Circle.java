package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle {"
                + "radius=" + radius
                + ", color is " + this.getColor() + '}';
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}

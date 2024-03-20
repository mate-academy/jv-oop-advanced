package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area - " + getArea() + ", radius - " + getRadius()
                + ", color - " + getColor());
    }
}

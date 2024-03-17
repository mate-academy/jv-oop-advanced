package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private double radius;

    public void setRadius(double radius) {
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
        System.out.println("Figure: " + getClass().getSimpleName() + ", area - "
                + getArea() + ", radius - " + radius
                + ", color - " + getColor());
    }
}

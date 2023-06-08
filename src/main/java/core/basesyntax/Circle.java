package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {

    }

    public Circle(Color color, int radius) {
        this.radius = radius;
        setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), radius, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

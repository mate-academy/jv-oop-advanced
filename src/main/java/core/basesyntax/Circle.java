package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + ", area: " + getArea()
                + " sq.units, radius " + radius + " units";
    }
}

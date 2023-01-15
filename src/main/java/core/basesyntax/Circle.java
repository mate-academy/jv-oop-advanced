package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: Circle {" +
                "radius: " + radius + " units" +
                ", color: " + getColor() +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

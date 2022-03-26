package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().toLowerCase();
    }
}

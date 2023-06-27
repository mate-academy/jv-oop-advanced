package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius
                + ", color: " + getColor().name().toLowerCase());
    }
}

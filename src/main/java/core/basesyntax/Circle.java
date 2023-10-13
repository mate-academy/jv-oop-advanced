package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().name().toLowerCase());
    }
}

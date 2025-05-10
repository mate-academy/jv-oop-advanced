package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFigureInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq. units, radius: " + radius + " units, color: "
                + getColor().name().toLowerCase();
    }
}

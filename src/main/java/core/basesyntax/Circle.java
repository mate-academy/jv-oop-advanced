package core.basesyntax;

public class Circle implements Figure {
    private final double radius;
    private final Color color;

    Circle(double radius, Color color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        return 3.1415 * radius * radius;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea()
                + "units, side: " + radius + " units, color: " + getColor();
    }
}

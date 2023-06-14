package core.basesyntax;

public class Circle extends Figure {

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: circle, area: %.2f sq.units, radius: %d units, color: %s",
                2 * Math.PI * radius, radius, color);
    }
}

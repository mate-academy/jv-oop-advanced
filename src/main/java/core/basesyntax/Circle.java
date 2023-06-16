package core.basesyntax;

public class Circle extends Figure {

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: circle, area: %.2f sq.units, radius: %d units, color: %s",
                area(), radius, getColor());
    }
}

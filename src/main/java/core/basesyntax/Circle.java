package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, FigurePainter {
    private final int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.1f", getArea())
                + " sq.units, radius: "
                + radius
                + " units, color: " + getColor());
    }
}

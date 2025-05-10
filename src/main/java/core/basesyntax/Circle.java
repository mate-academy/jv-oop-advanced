package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawTheFigure() {
        System.out.printf("Figure: circle, area: %.1f sq.units,"
                        + " radius: %d units, color: %s%n",
                calculateArea(), radius, getColor().toLowerCase());
    }
}

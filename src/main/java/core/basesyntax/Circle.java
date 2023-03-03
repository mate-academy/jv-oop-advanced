package core.basesyntax;

public class Circle extends Figure {
    private static final String NAME = "CIRCLE";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}

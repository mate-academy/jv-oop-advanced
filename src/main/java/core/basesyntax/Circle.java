package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: circle, area: "
                + getTheArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }

    @Override
    public double getTheArea() {
        return radius * radius * Math.PI;
    }
}

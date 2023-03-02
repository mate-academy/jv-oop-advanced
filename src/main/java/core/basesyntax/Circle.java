package core.basesyntax;

public class Circle extends Figure {
    private static final String name = "Circle";
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
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}

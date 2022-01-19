package core.basesyntax;

public class Circle extends Figure implements FigureProperties {
    private int radius;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Figure: circle. Radius: " + radius +
                "mm. Area: " + getArea() + " sq.mm. Color: " + colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

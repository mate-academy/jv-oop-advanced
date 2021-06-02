package figures;

import behavior.ColorSupplier;
import behavior.Figure;
import behavior.GetAreaAble;

public class Circle extends Figure implements GetAreaAble {
    private final double radius;
    private final String name = "Circle";

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + colorSupplier.getRandomColor();
    }
}

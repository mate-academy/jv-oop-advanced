package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Circle extends Figure {
    private static final String name = "circle";
    private int radius;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Circle() {
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, radius = " + radius
                + " units, color: " + getColor();
    }
}

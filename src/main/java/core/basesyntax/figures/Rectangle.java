package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {
    private static final String name = "rectangle";
    private int length;
    private int width;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Rectangle() {
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, length = " + length
                + " units, width = " + width
                + " units, color: " + getColor();
    }
}

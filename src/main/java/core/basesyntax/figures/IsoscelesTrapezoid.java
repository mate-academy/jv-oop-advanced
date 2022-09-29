package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final String name = "isosceles trapezoid";
    private int topSide;
    private int downSide;
    private int height;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int topSide, int downSide, int height, String color) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2f) * height;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, topSide = " + topSide
                + " units, downSide = " + downSide
                + " units, height = " + height
                + " units, color: " + getColor();
    }
}

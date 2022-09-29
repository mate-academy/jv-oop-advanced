package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private final String name = "square";
    private int side;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Square() {
    }

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, side = " + side
                + " units, color: " + getColor();
    }
}

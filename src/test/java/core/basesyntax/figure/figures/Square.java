package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "SQUARE";
    private int leg;

    public Square(String name, String color, int leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", Leg: " + leg + ", Area: " + getArea() + ".");
    }
}

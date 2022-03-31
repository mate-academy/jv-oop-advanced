package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "RIGHT_TRIANGLE";
    private int side;

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Right Triangle, Color: " + color + ", Side: " + side + ", Area: " + getArea() + ".");
    }

    @Override
    public void setRandomParameter() {
        this.side = random.nextInt();
        color = new ColorSupplier().getRandomColor();
        name = NAME_DEFAULT;
    }
}

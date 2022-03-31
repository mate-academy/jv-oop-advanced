package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "SQUARE";
    private int leg;

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: SQUARE, Color: " + color + ", Leg: " + leg + ", Area: " + getArea() + ".");
    }

    @Override
    public void setRandomParameter() {
        this.leg = random.nextInt();
        color = new ColorSupplier().getRandomColor();
        name = NAME_DEFAULT;
    }
}

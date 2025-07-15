package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private final Random random = new Random();
    private int side = random.nextInt(35) + 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Square() {
        super.setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "\n" + "Figure: square, "
                + "area: " + getArea() + " sq. units, side: " + side
                + ", color: " + getColor();
    }
}

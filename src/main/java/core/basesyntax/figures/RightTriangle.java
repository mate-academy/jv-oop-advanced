package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private int firstLeg = random.nextInt(35) + 1;
    private int secondLeg = random.nextInt(35) + 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public RightTriangle() {
        super.setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public String draw() {
        return "\n" + "Figure: right triangle, "
                + "area: " + getArea() + " sq. units, first leg: "
                + firstLeg + ", second leg: "
                + secondLeg + ", color: " + getColor();
    }
}

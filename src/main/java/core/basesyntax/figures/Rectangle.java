package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private int width = random.nextInt(35) + 1;
    private int length = random.nextInt(35) + 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle() {
        super.setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String draw() {
        return "\n" + "Figure: rectangle, "
                + "area: " + getArea() + " sq. units, width: "
                + width + ", length: "
                + length + ", color: " + getColor();
    }
}

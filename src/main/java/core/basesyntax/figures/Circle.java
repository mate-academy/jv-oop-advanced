package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Circle extends Figure {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final double piValues = Math.PI;
    private int radius = random.nextInt(35) + 1;

    public Circle() {
        super.setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        double area = piValues * Math.pow(radius, 2);
        BigDecimal bd = new BigDecimal(area);
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String draw() {
        return "\n" + "Figure: circle, "
                + "area: " + getArea() + " sq. units, radius: " + radius
                + ", color: " + getColor();
    }
}

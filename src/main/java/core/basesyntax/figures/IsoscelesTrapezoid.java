package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final Random random = new Random();
    private int height = random.nextInt(35) + 1;
    private int upperBase = random.nextInt(35) + 1;
    private int lowerBase = random.nextInt(35) + 1;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public IsoscelesTrapezoid() {
        super.setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        double area = (upperBase + lowerBase) * height / 2.0;
        BigDecimal bd = new BigDecimal(area);
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String draw() {
        return "\n" + "Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, height: "
                + height + ", upper base side: "
                + upperBase + ", lower base side: "
                + lowerBase + ", color: " + getColor();
    }
}

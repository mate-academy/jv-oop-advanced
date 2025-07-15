package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DefaultCircle extends Figure {
    private final int defaultRadius = 10;
    private final String defaultColor = Color.WHITE.name();
    private final double piValues = Math.PI;

    @Override
    public double getArea() {
        double area = piValues * Math.pow(defaultRadius, 2);
        BigDecimal bd = new BigDecimal(area);
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String draw() {
        return "\n" + "Figure: circle, "
                + "area: " + getArea() + " sq. units, radius: " + defaultRadius
                + ", color: " + defaultColor;
    }
}

package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String writeText() {
        DecimalFormat decimalFrmt = new DecimalFormat("#.##");
        return "Figure: circle, area = " + decimalFrmt.format(getArea())
                + " sq.units, radius: " + radius + " units, color: "
                + getColor().toString().toLowerCase(Locale.ROOT);
    }
}

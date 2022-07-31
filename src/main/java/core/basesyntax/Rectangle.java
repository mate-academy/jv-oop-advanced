package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Locale;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String writeText() {
        DecimalFormat decimalFrmt = new DecimalFormat("#.##");
        return "Figure: rectangle, area = " + decimalFrmt.format(getArea())
                + " sq.units, height: " + height + " units, width: " + width + "units, color: "
                + getColor().toString().toLowerCase(Locale.ROOT);
    }
}

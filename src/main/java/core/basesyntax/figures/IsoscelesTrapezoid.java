package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Describer;

public class IsoscelesTrapezoid extends Figure {
    private static final String type = "trapezoid";
    private final int top;
    private final int bottom;
    private final int height;

    public IsoscelesTrapezoid(int top, int bottom, int height, String color) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (top + bottom) * 0.5 * height;
    }

    @Override
    public String getInfo() {
        String name = "trapezoid";
        return "Figure: "
                + type + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "top: "
                + top
                + " units, "
                + "bottom: "
                + bottom
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + color;
    }
}

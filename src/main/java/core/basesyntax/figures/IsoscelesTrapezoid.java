package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int sideUp;
    private final int sideDown;
    private final int height;
    private final Color color;

    public IsoscelesTrapezoid(int sideUp, int sideDown, int height, Color color) {
        this.sideUp = sideUp;
        this.sideDown = sideDown;
        this.height = height;
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid" + ", area: " + area() + " sq. units"
                + ", sideUp: " + sideUp + " units, " + "sideDown: " + sideDown + " units, "
                    + "height: " + height + " units," + "color: " + color;
    }

    @Override
    public double area() {
        return ((double) (sideUp + sideDown) / 2) * height;
    }
}

package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upSide;
    private int downSide;

    public IsoscelesTrapezoid(Color color, int height, int upSide, int downSide) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return (upSide + downSide) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, height: "
                + height + " units, upSide: " + upSide + " units, downSide: " + downSide
                + " units, color: " + getColor();
    }
}

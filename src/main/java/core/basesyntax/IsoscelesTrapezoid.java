package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int downSide;
    private int upSide;
    private int side;

    public IsoscelesTrapezoid(int downSide, int upSide, int side, Color color) {
        super(color);
        this.downSide = downSide;
        this.upSide = upSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        return (0.5 * (downSide + upSide)
                * Math.sqrt(Math.pow(side,2) - (0.25 * Math.pow(downSide - upSide, 2))));
    }

    @Override
    public String writeText() {
        DecimalFormat decimalFrmt = new DecimalFormat("#.##");
        return "Figure: isosceles trapezoid, area = " + decimalFrmt.format(getArea())
                + " sq.units, downSide: " + downSide + " units, upSide: " + upSide
                + " units, side: " + side + " units, color: "
                + getColor().toString().toLowerCase(Locale.ROOT);
    }
}

package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Locale;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String writeText() {
        DecimalFormat decimalFrmt = new DecimalFormat("#.##");
        return "Figure: right triangle, area = " + decimalFrmt.format(getArea())
                + " sq.units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + "units, color: " + getColor().toString().toLowerCase(Locale.ROOT);
    }
}

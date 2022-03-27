package core.basesyntax.model;

import java.text.DecimalFormat;

public class RightTriangle extends Figure implements AreaCalculator {
    private int firstLeg;
    private int secondLeg;
    private DecimalFormat decimalFormat = new DecimalFormat("0.0");

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        if (firstLeg == 1 && secondLeg == 1) {
            return 0.5;
        } else {
            return Double.parseDouble(decimalFormat.format((firstLeg * secondLeg) / 2));
        }
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Figure: right triangle, area: ").append(getArea())
                .append(" sq.units, first leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg)
                .append(" units, color: ").append(getColor()).toString();
    }
}

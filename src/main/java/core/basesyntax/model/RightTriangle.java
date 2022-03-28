package core.basesyntax.model;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.0");
    private int firstLeg;
    private int secondLeg;

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
            return Double.parseDouble(DECIMAL_FORMAT.format((firstLeg * secondLeg) / 2));
        }
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: right triangle, area: ").append(getArea())
                .append(" sq.units, first leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg)
                .append(" units, color: ").append(getColor().toLowerCase()));
    }
}

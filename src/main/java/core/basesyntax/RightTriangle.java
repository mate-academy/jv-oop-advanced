package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondleg;

    public RightTriangle(String name, String color, double firstLeg, double secondleg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondleg = secondleg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondleg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + new DecimalFormat(ROUNDING_PATTERN).format(calculateArea())
                + " sq.units, " + " first leg: " + firstLeg + " units,"
                + " second leg: " + secondleg + " units,"
                + " color: " + getColor());
    }
}

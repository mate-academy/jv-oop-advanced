package core.basesyntax;

import auxiliary.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;

    public IsoscelesTrapezoid(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return Math.round((Math.pow(sideA + sideB, 2)) * 100.0) / 100.0;
    }

    public String getInfo() {
        return "Figure: IsoscelesTrapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "side_a: " + sideA + " units, "
                + "side_b: " + sideB + " units, "
                + "color: " + getColor();
    }
}

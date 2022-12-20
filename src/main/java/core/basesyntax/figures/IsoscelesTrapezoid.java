package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBase;
    private double upperBase;
    private double side;

    public IsoscelesTrapezoid(Color color, double lowerBase, double upperBase, double side) {
        super(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.side = side;
    }

    public IsoscelesTrapezoid(Color color) {
        super(color);
    }

    @Override
    public double square() {
        return ((lowerBase + upperBase) / 2) * Math.sqrt(Math.pow(side, 2) - (Math.pow(lowerBase - upperBase, 2) / 4));
    }

    @Override
    public void draw() {
        String square = String.format("%.1f", square());
        System.out.println("Figure: isoscelesTrapezoid, area: " + square + " sq.units, lowerBase: " + lowerBase
                + " units, " + "upperBase: " + upperBase + ", side: " + side + ", units, color: " + super.getColor());

    }
}

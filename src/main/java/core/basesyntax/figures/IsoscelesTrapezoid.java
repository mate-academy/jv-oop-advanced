package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double bottomBase;
    private double side;

    public IsoscelesTrapezoid(String color, double upperBase, double bottomBase, double side) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((upperBase + bottomBase) / 2)
            * Math.sqrt(side * side - ((bottomBase - upperBase) * (bottomBase - upperBase)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid"
                + " area:" + getArea()
                + " sq.units, upperBase: " + upperBase
                + " units, bottomBase: " + bottomBase
                + " units, side: " + side
                + " units, color: " + getColor().toLowerCase());
    }
}

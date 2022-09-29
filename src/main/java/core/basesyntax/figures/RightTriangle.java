package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0d;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getFormatted(getArea())
                + " sq.units, first leg: "
                + getFormatted(getFirstLeg())
                + " units, second leg: "
                + getFormatted(getSecondLeg())
                + " color: "
                + getColor().name().toLowerCase());
    }
}

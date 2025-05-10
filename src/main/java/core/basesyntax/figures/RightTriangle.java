package core.basesyntax.figures;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg + secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + firstLeg + " units, second leg: " + secondLeg
                + " units, color: " + getColor().name());
    }
}

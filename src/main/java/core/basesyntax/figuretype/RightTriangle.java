package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, String type, int firstLeg, int secondLeg) {
        super(color, type);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, first leg: %s"
                        + " units, second leg: %s units, color: %s%n",
                getType(), getArea(), firstLeg, secondLeg, getColor());
    }
}

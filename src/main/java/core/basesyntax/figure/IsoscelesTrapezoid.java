package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int smallerBase;
    private int biggerBase;

    public IsoscelesTrapezoid(String color, int smallerBase, int biggerBase) {
        super(color);
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
    }

    @Override
    public void drawFigure() {
        double square;
        if (biggerBase < smallerBase) {
            square = (smallerBase - biggerBase) / 2;
        } else {
            square = (biggerBase - smallerBase) / 2;
        }

        System.out.println("Figure: isosceles trapezoid, area: " + square
                        + " sq.units, bottom base: " + biggerBase
                        + " units, up base: " + smallerBase
                        + " units,"
                        + " color: " + getColor());
    }
}

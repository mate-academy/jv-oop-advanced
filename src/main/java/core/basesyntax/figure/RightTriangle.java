package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(String color, int leg1, int leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public void drawFigure() {
        double square = leg1 * leg2 / 2;

        System.out.println("Figure: right triangle, area: " + square
                + " sq.units, leg 1: " + leg1
                + " units, leg 2: " + leg2
                + " units,"
                + " color: " + getColor());
    }
}

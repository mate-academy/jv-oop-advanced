package core.basesyntax.entity;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + getArea() + " sq.units, side A: "
                + sideA + " units, side B:" + sideB + " units, height: "
                + height + " units, color: " + super.getColor();
    }
}


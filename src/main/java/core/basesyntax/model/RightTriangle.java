package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;

public class RightTriangle extends Rectangle {

    public RightTriangle(Color color, int oneSide, int secondSide) {
        super(color, oneSide, secondSide);
    }

    @Override
    public double getArea() {
        return ((double) getOneSide() * getSecondSide() / 2);
    }

    @Override
    public String toString() {
        return "Figure: " + figureType + ", area: " + getArea() + " sq.units, firstLeg: "
                + getOneSide() + " units, secondLeg: " + getSecondSide() + " units, color: "
                + getColor().toString().toLowerCase();
    }
}

package core.basesyntax.figures;

import core.basesyntax.abstractClasses.Figure;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public RightTriangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return Math.round(((double) (firstSide * secondSide) / 2) * 100.0) / 100.0;
    }

    @Override
    public String drawInfo() {
        return "RightTriangle:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + "; color = " + getColor()
                + "; area = " + getArea();
    }
}

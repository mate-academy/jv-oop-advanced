package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;

public class RightTriangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public RightTriangle(int firstSide, int secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return Math.round((double) (firstSide * secondSide) / 2);
    }

    @Override
    public void drawInfo() {
        System.out.println("RightTriangle:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + "; color = " + getColor()
                + "; area = " + getArea());
    }
}

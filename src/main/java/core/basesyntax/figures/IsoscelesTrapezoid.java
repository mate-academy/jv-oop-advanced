package core.basesyntax.figures;

import core.basesyntax.abstractClasses.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(((double) ((firstSide + secondSide) / 2) * height) * 100.0) / 100.0;
    }

    @Override
    public String drawInfo() {
        return "IsoscelesTrapezoid:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + " height = " + getHeight()
                + "; color = " + getColor()
                + "; area = " + getArea();
    }
}

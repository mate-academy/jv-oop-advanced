package core.basesyntax.figures;

import core.basesyntax.abstractClasses.Figure;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return Math.round((double) (firstSide * secondSide) * 100.0) / 100.0;
    }

    @Override
    public String drawInfo() {
        return "Rectangle:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + "; color = " + getColor()
                + "; area = " + getArea();
    }
}

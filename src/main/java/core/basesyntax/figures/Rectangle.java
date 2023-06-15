package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
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
        return Math.round((double) firstSide * secondSide);
    }

    @Override
    public void drawInfo() {
        System.out.println("Rectangle:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + "; color = " + getColor()
                + "; area = " + getArea());
    }
}

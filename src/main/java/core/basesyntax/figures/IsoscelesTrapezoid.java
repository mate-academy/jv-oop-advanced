package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return Math.round((double) ((firstSide + secondSide) / 2) * height);
    }

    @Override
    public void drawInfo() {
        System.out.println("IsoscelesTrapezoid:"
                + " firstSide = " + getFirstSide()
                + " secondSide = " + getSecondSide()
                + " height = " + getHeight()
                + "; color = " + getColor()
                + "; area = " + getArea());
    }
}

package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + "sq.units, firstSide: "
                + firstSide + ", secondSide: " + secondSide + ", color: " + getColor());
    }
}
